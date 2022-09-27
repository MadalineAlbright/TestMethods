package com.example.testmethods.tests;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class Encryption {

    public static void main (String[] args){
        String encryptedpassword= EncryptedPassword("a","123");
        log.info("The encrypted password is ==="+encryptedpassword);
    }

    public static String EncryptedPassword(String rawpassword, String sessionID) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String MD5PsswordHash = "";
            byte[] messageDigest = md.digest(rawpassword.getBytes());

            BigInteger passSignum = new BigInteger(1, messageDigest);
            MD5PsswordHash = passSignum.toString(16);
            while (MD5PsswordHash.length() < 32) {
                MD5PsswordHash = "0" + MD5PsswordHash;
            }
            MD5PsswordHash = MD5PsswordHash.toUpperCase();
            return Hash_Shah512PlusSalt(sessionID, MD5PsswordHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String Hash_Shah512PlusSalt(String SessionID, String md5Hashed) {
        String hashedOutput = "Auth2DefaultOutput";
        String HashingMode = "SHA-512";
        try {
            MessageDigest md = MessageDigest.getInstance(HashingMode);
            md.update(SessionID.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest(md5Hashed.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff)  + 0x100, 16).substring(1));
            }
            hashedOutput = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedOutput;
    }
}

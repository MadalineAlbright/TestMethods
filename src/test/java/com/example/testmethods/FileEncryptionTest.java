package com.example.testmethods;

import com.example.testmethods.tests.CryptoException;
import com.example.testmethods.tests.EncrptFile;

import java.io.File;

public class FileEncryptionTest {
    public static void main(String[] args) {

        String key = "maddie22wtgs1111";
        File inputFile = new File("src/main/resources/document.txt");
        File encryptedFile = new File("document.encrypted");
        File decryptedFile = new File("document.decrypted");

        try {
            EncrptFile.encrypt(key, inputFile, encryptedFile);
            EncrptFile.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

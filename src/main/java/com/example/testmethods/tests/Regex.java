package com.example.testmethods.tests;

public class Regex {
    public static void main(String[] args) {
        String myString = "I am a developer. Yes I am.";
        System.out.println(myString);
        // Use a regex to replace character I with You.
        String newString = myString.replaceAll("I", "YOU");
//        String newString = myString.replaceAll("[a-zA-Z\\d\\s]", "YOU");
        System.out.println("REPLACED STRING" + newString);
        //---------------------------------------------------------------------------------------------
        // using "^" operator
//        String test = "abdabd1234CggdJhd";
//        String testReplace = test.replaceAll("^abd", "ABCD");
//        System.out.println(test);
//        System.out.println(testReplace);
//        // "Matches" matches a pattern with the whole string.
//        boolean matches = testReplace.matches("^ABCDabd1234CggdJhd");
//        System.out.println(matches);
//        // Using "$" operator
//        String email = "nephatmutugi@students.uonbi.com";
//        System.out.println(email);
//        String correctEmail = email.replaceAll(".com$", ".co.ke");
//        System.out.println(correctEmail);
//        System.out.println("------------------TEST PHONE NUMBERS-------------------");
//        String phone = "+254741574821";
//        System.out.println(phone.replaceAll("[^a-zA-Z0-9\\s]", ""));
//        String newPhone = phone.replaceAll("\\+254", "0");
//        System.out.println(phone);
//        System.out.println(newPhone);
    }
}
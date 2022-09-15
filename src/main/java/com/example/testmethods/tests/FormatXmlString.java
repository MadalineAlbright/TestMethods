package com.example.testmethods.tests;

public class FormatXmlString {

    public String sanitizeXmlString(String strData) {
        if (strData == null) {
            return null;
        } else {
            return strData
//                    .replaceAll("<", "&lt;")
//                    .replaceAll(">", "&gt;")
//                    .replaceAll("'", "&apos;")
//                    .replaceAll("\"", "&quot;")
//                    .replaceAll("&", "&amp;")
                    .replaceAll("ns6", "maddie");
        }
    }
}

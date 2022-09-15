package com.example.testmethods.tests;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;
@Slf4j
public class ConvertDateTimeToJulianDateTime {
    //DD-MM-YY and time into julien date and time like this 342675
    public static int JGREG= 15 + 31*(10+12*1582);
    public static double toJulian(int[] ymd) {
        int year=ymd[0];
        int month=ymd[1]; // jan=1, feb=2,...
        int day=ymd[2];
        int julianYear = year;
        if (year < 0) julianYear++;
        int julianMonth = month;
        if (month > 2) {
            julianMonth++;
        }
        else {
            julianYear--;
            julianMonth += 13;
        }

        double julian = (java.lang.Math.floor(365.25 * julianYear)
                + java.lang.Math.floor(30.6001*julianMonth) + day + 1720995.0);
        if (day + 31 * (month + 12 * year) >= JGREG) {
            // change over to Gregorian calendar
            int ja = (int)(0.01 * julianYear);
            julian += 2 - ja + (0.25 * ja);
        }
        return java.lang.Math.floor(julian);
    }

    public static void main (String[] args){
        String input = "2019035";
        try{
            java.text.DateFormat fmt1 = new java.text.SimpleDateFormat("yyyyDDD");
            Date date = fmt1.parse(input);
//            java.text.DateFormat fmt2 = new java.text.SimpleDateFormat("dd-MMM-yyyy");
            java.text.DateFormat fmt2 = new java.text.SimpleDateFormat("E, MMM dd yyyy");
//            java.text.DateFormat fmt2 = new java.text.SimpleDateFormat("MMM/dd/yyyy");

            //Output = fmt2.format(date);
            System.out.println(fmt2.format(date));
        }
        catch(java.text.ParseException e){
            log.info("Parsing error : " + e);
        }
    }
}

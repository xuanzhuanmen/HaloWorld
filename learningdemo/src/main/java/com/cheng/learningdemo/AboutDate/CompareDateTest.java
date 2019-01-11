package com.cheng.learningdemo.AboutDate;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date a1 = sdf.parse("2018-12-01");
            Date b1 = sdf.parse("2018-12-11");
            Date a2 = sdf.parse("2018-12-02");
            Date b2 = sdf.parse("2018-12-12");
            Long k = a1.getTime();
            String date_string = sdf.format(new Date(k * 1000L));
            System.out.println(date_string);
            System.out.println(k);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

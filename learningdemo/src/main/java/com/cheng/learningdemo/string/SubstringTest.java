package com.cheng.learningdemo.string;

public class SubstringTest {
    public static void main(String[] args) {
        String month = "2018-12-11";
        System.out.println(month.length());
        String result = month.substring(0, 7);
        System.out.println(result);

        //
        String month2 = "";
        if(month2.length() > 7) {
            System.out.println(month2.substring(0, 7));
        }else {
            System.out.println("-------");
        }

    }
}

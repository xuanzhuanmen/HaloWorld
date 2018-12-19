package com.cheng.learningdemo.string;

public class StringSplitTest {
    public static void main(String[] args) {
        String a = "123&456";
        String b = "123";
        String[] arr1 = a.split("&");
        for(String str : arr1) {
            System.out.println(str);
        }
        String[] arr2 = b.split("&");
        for (String str : arr2) {
            System.out.println(str);
            System.out.println("-------------");
        }
    }
}

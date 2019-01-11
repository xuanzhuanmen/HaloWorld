package com.cheng.learningdemo.basic;

public class CalculateTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        double result = Double.valueOf(a)/Double.valueOf(b);
        double result3 = a/b;
        double a2 = 1;
        double b2 = 12;
        double result2 = a2/b2;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);//注意这种情况，int/int 得到的结果就有问题。
    }
}

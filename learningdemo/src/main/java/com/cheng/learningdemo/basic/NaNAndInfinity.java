package com.cheng.learningdemo.basic;

/**
 * double、float类型，如果除以0，会得到一个类型为Infinity的结果。
 * from：https://www.cnblogs.com/zhisuoyu/p/5314541.html
 */
public class NaNAndInfinity {
    public static void main(String[] args) {
        /**
         * About Infinity
         */
        double a = 1D / 0D;//Infinity
        float b = -1F / 0F;//-Infinity
        System.out.println(a);
        System.out.println(b);
        //判断是不是Infinity
        System.out.println(Double.isInfinite(a));
        System.out.println(Double.isInfinite(b));

        /**
         * About NaN
         * double、float类型：0除以0 就会得到NaN
         */
        double c = 0D / 0;
        float d = 0F / 0;
        System.out.println(c);
        System.out.println(d);
        //判断是否是NaN
        System.out.println(Double.isNaN(c));

    }
}

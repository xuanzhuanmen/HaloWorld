package com.cheng.learningdemo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * from：https://my.oschina.net/benhaile/blog/408377
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        //Before Java 8 :
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (Object feature : features) {
            System.out.println(feature);
        }
        System.out.println("----------------------------------------------");
        List list = new ArrayList();
        list.add("B");
        list.add("U");
        list.add("S");
        //In Java 8:
        //lambda写法
        features.forEach(n -> System.out.println(n));
        list.forEach(n -> System.out.println(n));
        System.out.println("----------------------------------------------");
        //方法引用实现方式
        features.forEach(System.out::println);
    }
}

package com.cheng.learningdemo.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaStreamTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("b1");
        list.add("a2");
        list.add("b2");


        // list.stream().filter((s -> s.startsWith("a"))).forEach(System.out::println);
        // 平行流
        // list.parallelStream().filter((s -> s.startsWith("a"))).forEach(System.out::println);
        // boolean anyStartWithA = list.stream().anyMatch((s -> s.startsWith("a")));
        // System.out.println(anyStartWithA);
        list.parallelStream().filter((s -> s.startsWith("a"))).forEach(System.out::println);
    }
}

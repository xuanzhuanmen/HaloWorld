package com.cheng.learningdemo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest4 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("TaoBao");
        names.add("ZhiFuBao");
        List<String> lowercaseNames = names.stream().map((String name) -> {return name.toLowerCase();}).collect(Collectors.toList());
        System.out.println(lowercaseNames);
    }
}

package com.example.chasecustomer.threadlocal;

import org.springframework.util.StringUtils;

public class Sample {

    int a;
    int b;

    public static void main(String[] args) {
        String a = "hi";
       boolean aa =  StringUtils.isEmpty(a);
        System.out.println(aa);
    }
}

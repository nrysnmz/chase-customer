package com.example.chasecustomer.threadlocal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ThreadL {
    public static void main(String[] args) {
        ThreadLocal a = new ThreadLocal();
        System.out.println(a);
        System.out.println(a.get());
        a.set("hi");
        System.out.println(a.get());

    }
}




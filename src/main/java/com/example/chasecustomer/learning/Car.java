package com.example.chasecustomer.learning;

public class Car {

    void run(CarParts carParts){
        System.out.println("hi");
        carParts.door="bye";
    }
    public static void main(String[] args) {

    }
}

class CarParts{
    String door;
    String glass;
}

package com.example.chasecustomer.learning;

public enum Laptop {
    APPLE(2,"hi"), MICROSOFT(3,"b"), DELL;

    private int price;
    private String level;
    Laptop(){

    }
    Laptop(int price, String level){
        this.level= level;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

class Run{
    public static void main(String[] args) {
        Laptop laptop = Laptop.APPLE;
        System.out.println(laptop);

        for (Laptop l : Laptop.values()){
            System.out.println(l + " "+ l.getPrice());
        }
    }
}

package com.example.chasecustomer.learning;

public enum DaysOfWeek {
    SUNDAY(2, 3),MONDAY(3,4);

    final int level;
    final int age;
    DaysOfWeek(int level, int age){
        this.level=level;
        this.age= age;
    }

     int getLevel(){
        return level;
    }


}

class Main{
    public static void main(String[] args) {
        DaysOfWeek mon = DaysOfWeek.MONDAY;
        System.out.println(mon);


        System.out.println( mon.getLevel());


    }
}
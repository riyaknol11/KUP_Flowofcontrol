package com.knoldus.task10;

public class DayOfWeek {

    //defining the enum
    enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
    public static void main(String[] args) {
        //The values() method of enum in Java is used for looping through an enum's constants
        for (Days index: Days.values() )
            System.out.println(index);


    }
}

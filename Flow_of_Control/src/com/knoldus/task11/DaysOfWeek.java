package com.knoldus.task11;

import com.knoldus.task10.DayOfWeek;

public class DaysOfWeek {
    //defining enum with constants
    enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
    public static void main(String[] args) {
        //The values() method of enum in Java is used for looping through an enum's constants
        for (Days index : Days.values() )
            System.out.println(index);


    }
}

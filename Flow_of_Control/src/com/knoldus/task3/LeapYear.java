package com.knoldus.task3;

import java.util.Scanner;

public class LeapYear {

    //function to check if the given year is a leap year
    public static void findLeapYear(int year){
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            else{
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println("It is not a leap year");
        }
    }
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year :");
        year = input.nextInt();
        findLeapYear(year);
    }
}

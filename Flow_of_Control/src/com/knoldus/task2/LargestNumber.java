package com.knoldus.task2;

import java.util.Scanner;

public class LargestNumber {
    public static int LargestNumberDetermination(int number1, int number2, int number3){
        int largest;
        largest = number3 > (number1 > number2 ? number1 : number2) ? number3 : ((number1 > number2) ? number1 : number2);
        return largest;
    }
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        number1 = input.nextInt();
        System.out.println("Enter the second number :");
        number2 = input.nextInt();
        System.out.println("Enter the third number :");
        number3 = input.nextInt();
        System.out.println("The largest number is " + LargestNumberDetermination(number1, number2, number3));

    }
}

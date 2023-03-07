package com.knoldus.task8;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int calculateSum(int numbers){
        int count =1, sum=0;
        while(count <= numbers){
            sum = sum + count;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value upto which the sum of natural numbers is to be calculated :");
        numbers = input.nextInt();

        System.out.println("Sum of the natural numbers is : " + calculateSum(numbers));
    }

}

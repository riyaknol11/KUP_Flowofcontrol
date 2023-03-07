package com.knoldus.task1;

import java.util.Scanner;
public class EvenOdd {
        public static void main(String[] args) {
            int number;
            //User input for the number
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number :");
            number = input.nextInt();

            if(number % 2 ==0){
                System.out.println(number + " is even");
            }
            else{
                System.out.println(number + " is odd");
            }
        }
    }



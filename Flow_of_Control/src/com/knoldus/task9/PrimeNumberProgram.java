package com.knoldus.task9;

import java.util.Scanner;

public class PrimeNumberProgram {

    //function to check if the entered number is prime or not
    public static void isPrime(int number){
        int index = 2, count =0;
        do {
            if (number == 2)
                break;
            else if (number % index == 0) {
                count++;
                break;
            }
            index++;

        } while (index < number / 2);


        //condition to check whether the number is prime or not
        if (number == 1) {
            System.out.println("Not a prime number!");

        }
        else {
            if (count == 0) {
                System.out.println(number + " is a prime number!");
            }
            else {
                System.out.println(number + " is not a prime number!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime or not :");
        int number = input.nextInt();
        isPrime(number);


    }
}


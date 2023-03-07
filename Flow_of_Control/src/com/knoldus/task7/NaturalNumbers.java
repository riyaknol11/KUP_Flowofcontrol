package com.knoldus.task7;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = input.nextInt();
        System.out.println("\nNatural numbers from 1 to " + n);
        int index = 1;
        while(index<=n){
            System.out.print(index + " ");
            index++;
        }
    }
}

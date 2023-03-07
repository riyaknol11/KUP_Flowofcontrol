package com.knoldus.task5;
import java.util.Scanner;

public class GradingUsingNestedIf {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the percentage :");
        float percentage=input.nextFloat();
        char grade=' ';
        //Nested if statements to calculate the grade
        if(percentage<=100){
            grade='A';
            if (percentage<=90){
                grade='B';
                if (percentage<=80){
                    grade='C';
                    if (percentage<=70){
                        grade='D';
                        if(percentage<=60){
                            grade='E';
                        }
                    }
                }
            }
        }

        System.out.println("Grade of Student is : "+ grade);
    }
}

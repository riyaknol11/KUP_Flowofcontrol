package com.knoldus.task12;

import com.knoldus.task11.DaysOfWeek;

import java.util.Scanner;

public class EnumImplementation {
    enum Shape {
        CIRCLE, SQUARE, RECTANGLE, TRIANGLE;

    }

    public static double circleArea(int radius, double area){
        area = Math.PI * radius * radius;
        return area;
    }

    public static double squareArea(int side, double area){
        area = side * side;
        return area;
    }

    public static double rectangleArea(int length, int width, double area){
        area = length * width;
        return area;
    }
    public static double triangleArea(int base, int height, double area){
        area = 0.5 * base * height;
        return area;
    }


    public static void main(String[] args) {
        double area = 0.0;
        Scanner input = new Scanner(System.in);
        for (Shape index : Shape.values() )
            //calling out functions to calculate area for different shapes.
            if(index == Shape.CIRCLE){
                System.out.println("Enter the radius for circle :");
                int radius = input.nextInt();
                System.out.println("Area for circle is " + circleArea(radius, area));
            }
            else if(index == Shape.SQUARE) {
                System.out.println("Enter the side for square :");
                int side = input.nextInt();
                System.out.println("Area of square is " + squareArea(side,area));
            }
            else if(index == Shape.RECTANGLE) {
                System.out.println("Enter the length for Rectangle :");
                int length = input.nextInt();
                System.out.println("Enter the width");
                int width = input.nextInt();
                System.out.println("Area of rectangle is " + rectangleArea(length, width, area));
            }
            else{
                System.out.println("Enter the base for triangle :");
                int base = input.nextInt();
                System.out.println("Enter the height for triangle :");
                int height = input.nextInt();
                System.out.println("Area of triangle is " + triangleArea(base, height, area));
            }


    }
}
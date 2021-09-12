/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_8 {
    public static void main(String[] args)
    {
        int people, pizzas, slices, total, quotient,remainder;

        Scanner sc=new Scanner(System.in);

        System.out.print("How many people?");
        people=sc.nextInt();

        System.out.print("How many pizza pies do you have?");
        pizzas=sc.nextInt();

        System.out.print("How many slices of pizza per pie?");
        slices=sc.nextInt();
        total=pizzas*slices;

        System.out.println(""+people+" people with "+pizzas+" pizzas ("+total+"slices)");
        quotient=total/people;

        System.out.println("Each person gets "+quotient+" pieces of pizza");
        remainder=total%people;

        System.out.println("There are "+remainder+" leftover pieces");
    }
}

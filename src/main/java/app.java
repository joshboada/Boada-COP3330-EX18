/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class app {
    public static void main( String[] args )
    {
        double fahrenheit,celsius;

        Scanner input=new Scanner(System.in);
        System.out.println("Choose type of conversion \n C.Fahrenheit to Celsius  \n F.Celsius to Fahrenheit");
        String choice=input.nextLine();

        switch(choice)
        {
            case "c":
            case "C":
                System.out.println("Enter Fahrenheit temperature");
                fahrenheit = input.nextDouble();
                celsius =(fahrenheit - 32) * 5/9;
                System.out.println("Celsius temperature is = " + celsius);
                break;
            case "f":
            case "F":
                System.out.println("Enter Celsius temperature");
                celsius=input.nextDouble();
                fahrenheit=((9 * celsius) /5) + 32;
                System.out.println("Fahrenheit temperature is = " + fahrenheit);
                break;
            default:  System.out.println("please choose valid choice");
        }
    }
}
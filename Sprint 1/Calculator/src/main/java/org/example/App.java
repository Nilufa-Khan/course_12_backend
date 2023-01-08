package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println("Addition of  "+ num1 + " and  " +num2 + " = " + calculator.addition(num1,num2));
        System.out.println("subtraction of  "+ num1 + " and  " +num2 + " = " + calculator.subtraction(num1,num2));
        System.out.println("multiplication of  "+ num1 + " and  " +num2 + " = " + calculator.multiplication(num1,num2));
        System.out.println("division of  "+ num1 + " and  " +num2 + " = " + calculator.division(num1,num2));
        System.out.println("Modulo of  "+ num1 + " and  " +num2 + " = " + calculator.modulo(num1,num2));


    }
}

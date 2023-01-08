package org.example;

import java.util.Scanner;


public class App 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        System.out.println("Enter how many number you want to print");
        int count = sc.nextInt();
        fib.fibonacci(count);
    }
}

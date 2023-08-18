package it.pkg.model;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    public void addNumbers(){
        System.out.println("Write your first number ");
        int x = scanner.nextInt();
        System.out.println("Write your second number ");
        int y = scanner.nextInt();
        int sum = x + y;
        System.out.println("Addition of both numbers is " + sum);

    }

    public void subtractNumbers(){
        System.out.println("Write your first number ");
        int x = scanner.nextInt();
        System.out.println("Write your second number ");
        int y = scanner.nextInt();
        int subtract = x - y;
        System.out.println("Addition of both numbers is " + subtract);
    }

    public void multipyNumbers(){
        System.out.println("Write your first number ");
        int x = scanner.nextInt();
        System.out.println("Write your second number ");
        int y = scanner.nextInt();
        int subtract = x * y;
        System.out.println("Addition of both numbers is " + subtract);
    }
}

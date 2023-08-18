package com.interswitch.maven;

import com.interswitch.maven.model.Calculator;

import java.time.LocalDateTime;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main ( String[] args )

    {
        System.out.println("New Go-home feature by " + "Backbone Team suggested at " +
                LocalDateTime.now());
//        Calculator calculator = new Calculator();
//        calculator.addNumbers();
//        System.out.println();
//        calculator.subtractNumbers();
//        System.out.println();
//        calculator.multipyNumbers();

        UpperLowerCase ulcase = new UpperLowerCase();
        System.out.printf("%s to %s\n", "hello world", ulcase.wordToUpperCase("hello world"));

        System.out.printf("%s to %s\n", "HELLO WORLD", ulcase.wordToLowerCase("HELLO WORLD"));


    }
}

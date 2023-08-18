package com.interswitch.maven;

import com.interswitch.maven.model.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Calculator calculator = new Calculator();
        calculator.addNumbers();
        System.out.println();
        calculator.subtractNumbers();
        System.out.println();
        calculator.multipyNumbers();
    }
}

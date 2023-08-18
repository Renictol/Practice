#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.model.Calculator;

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

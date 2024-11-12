package org.javaclass.week1;

public class ErrorsExample {
    public static void main(String[] args) {

        //syntax errors are errors in the code that can be detected by the compiler
        // syntax error occur when a programmer breaks the rule of the language
        //System.out.println(anError);

        //runtime errors can only be caught while the program is running
        System.out.println(1/0);

        //logical errors are when you don't get the expected result
        System.out.println(""+1+1);
    }
}

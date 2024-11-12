package org.javaclass.week1;

public class MainMethodExample {

    public static void main(String[] args) {
        System.out.println("Hello main method");
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }

    /*  **public
        *The public keyword is an access modifier.
        *
        *It gives all classes in the application and in the JVM access to this class.
        *
        *It is necessary in the main method because the JVM's Application Classloader is a Java object.
        *
        * If no access modifier or any other modifier is used, the Application Classloader
            will not see the main method and the program WILL NOT RUN.
    */

    /*  **static
        *The static keyword is used to make the main method globally available
        *
        *This is how the JVM's Application Classloader is able to find the main method in an app
    */

    /*  **Method Signature main(String[] args)
        * The void keyword indicates that the method does not return a value
        * main is the method name
        * (String[] args) is the parameter list (This is where user input is collected as arguments or 'args')
        * The braces { } and everything inside the braces are called the method body
        * The method body is where the code to be executed is placed
    */



}
package org.javaclass.week1;

import org.javaclass.util.AnimatedCircle;
import javax.swing.*;

public class ImportExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        AnimatedCircle animation = new AnimatedCircle();
        frame.add(animation);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /*
     *When loading classes from the class path Java needs to know if a class needs other classes to run
     *
     *To solve this problem, the 'import' keyword is used to tell Java what other class libraries are used in a
     * class and where to look to find them

     * The 'package' keyword marks this class as part of the org.javaclass family of classes

     * Packages allow you to reuse class names in the same application.
     * */
}


package org.javaclass.week1;

public class BuildPathExample {

    public static void main(String[] args) {
        String buildPath = "src/main/java/org/javaclass/BuildPathExample.java";

        System.out.println("Buildpath: \n" + buildPath);

    }

    /*
     *Java source code needs to be compiled into byte code or .class files before the JVM can run the application

     *Java needs to know where the source code or .java files are

     *To solve this problem, Java uses the build path

     * What is the build path?
     *
        *The build path is a list of all the resources that are required to build a Java project
        *
        *This includes source files, class files, libraries, and other dependencies.

        *In a maven project the build path is set by the .pom file

        *The build path is everything under the /src directory

        *The build path can be viewed in Intellij : File -> Project Structure -> Modules -> Sources

        *The build path can also be viewed in the project window to the left.

        *And of course the class path can be viewed in the file system on your computer

        *
     * */
}

package org.javaclass.week1;
/*Java uses the class objects to run applications.

     *Java needs to know where the complied are classes are stored.

     *Java uses the -classpath or -cp variable  to solve this problem.

     * What is the class path?
        The class path is an environment variable that points to a list of directories
        where your application's compiled classes are stored.
*/
public class ClassPathExample {
    public static void main(String[] args) {
        String classPathKey = "java.class.path";

        String classpath = System.getProperty(classPathKey);

        System.out.println("Classpath: \n" + classpath);

    }
 /*
     * For example, the JVM needs to find the basic classes needed to run any Java program.

      *Before deployment, most Java programs have at minimum two directories where the basic classes are found:
      * JDK : The place where the java runtime classes are stored
      * The output or target folder: Where the classes made by the programmer are stored

      *In this program the JDK class path is set to:
      *   F:\Java\_JavaBuild\jdk-21.0.2

      *The output class path is set to:
      *   C:\Users\o_smi\Desktop\Java\Projects\JavaClassLevel1\JavaClassLevel1\target\classes

      *The target class path was set automatically by Maven. This can be seen in the .pom file

      *This can be seen in the .pom file

*
*
*
      *These paths can be viewed and set in Intellij : File -> Project Structure -> Modules -> Paths

      *The class path can also be viewed in the Console when the program is executed.

      *And of course the class path can be viewed in the file system on your computer

      *The above example uses a key for the Java Systems library to return the class path

  */
}


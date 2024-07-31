/**
 * Experiment 01. Understand the concept of object in Java.
 * Objectives: The students will learn
 *     - To declare, create and use a Java object.
 *     - To send messages to an object using instance methods.
 *     - The basic Java program components: Comments, Imports, Class        declaration, Method declarations.
 */
 
/**
 * Imports:
 *     - To import a class mention the <package name>.<class name>
 *     - To import all classes inside a package mention <package name>.*
 */
import javax.swing.*;

/**
 * Class declarations:
 *     - public is an access modifier
 *     - class is a keyword to define classes
 *     - OOPLab is the class name
 */
public class OOPLab {
    /**
     * Method declarations:
     *     - public static is an access modifier
     *     - void is return type
     *     - main is the method name
     *     - Strings[] args is the parameter
     */
    public static void main(String[] args) {
        // Object declaration
        JFrame myWindow;
        // Object creation
        myWindow = new JFrame();
        // Object use
        myWindow.setTitle("My First Java Program");
        myWindow.setSize(400, 200);
        myWindow.setVisible(true);
    }
}

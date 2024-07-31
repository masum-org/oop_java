/**
 * Experiment 02. Use Java Standard Classes
 * Objectives: The students will learn
 *     - To use existing classes before they learn to define their own classes in this course
 *     - Four standard classes: Scanner, String, Date, SimpleDateFormat
 */
 
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class OOPLab {
    public static void main(String[] args) {
        // Difference between print and println methods
        System.out.println("I Love Java.");
        System.out.println("Do you love Java?");
        
        /** String **/
        // String object creation
        String name = new String("Jon Java");
        System.out.println(name);
        
        // method: substring(i, j) => extract characters given an interval [i, j)
        String text = new String("Espresso");
        String textSubstr = text.substring(2, 6 + 1);
        System.out.println(textSubstr);
        
        // method: length() => returns the number of characters
        String text1 = "Programming";
        String text2 = "";
        String text3 = " ";
        System.out.println(text1.length());
        System.out.println(text2.length());
        System.out.println(text3.length());
        
        // method: indexOf(string) => returns the first position of the substring in the string object.
        String text4 = "I Love Java and Java loves me.";
        System.out.println(text4.indexOf("J"));
        System.out.println(text4.indexOf("love"));
        System.out.println(text4.indexOf("ove"));
        System.out.println(text4.indexOf("Me"));
        
        // String concatenation
        String text5 = "Jon";
        String text6 = "java";
        System.out.println(text5 + text6);
        System.out.println(text5 + " " + text6);
        System.out.println(text5 + ", " + text6);
        System.out.println("Are you " + text5 + " " + text6 + "?");
        
        /** Date **/
        Date today = new Date();
        System.out.println(today);
        
        /** SimpleDateFormat **/
        SimpleDateFormat format1, format2;
        format1 = new SimpleDateFormat("MM/dd/yy");
        format2 = new SimpleDateFormat("MMMM dd, yyyy");
        
        System.out.println(format1.format(today));
        System.out.println(format2.format(today));
        
        /** Scanner **/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Nice to meet you, " + firstName + ".");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your SSC GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your age is " + age);
        System.out.println("Your SSC gpa is " + gpa);
    }
}

/**
 * Experiment 03. 
 * Objectives: The students will learn
 *     - To declare, initialize and use the numerical data types in java 
 *     - To use Java arithematic expressions using operators
 *     - How to do type casting and constants
 *     - To display numerical values
 *     - About Java DecimalFormat, Math, Random, GregorianCalender class
 */
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Random;
import java.util.GregorianCalendar;

public class OOPLab {
    public static void main(String[] args) {
        // Declare numerical data. x and y is called variables.
        // A variable has three properties: memory location, type of data stored, name/identifier to refer to the memory location
        int x, y;
        double z;
        
        // initialize numerical data
        x = 10;
        y = 7;
        z = 2.5;
        
        // There are six numerical data types: byte, short, int, long, float, and double
        // declaration and initialization can be done at the same time.
        double area = 2.35;
        long bigNumber = 12457996589L;
        float height = 5.16F;
        
        // Math operators: +, -, *, /, %
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x / z);
        System.out.println(x % y);
        
        // Precedence rules: () > unary +, unary - > *, /, % > +, - 
        //    Rule 1. Expressions are evaluate from higher to lower precedence
        //    Rule 2. If precendence is same, evaluate left to right.
        // What will be the value of following expression?
        int p = x / -2 / 5 + 3 * 7 - (x + 3);
        System.out.println(p);
        
        // Type casting
        // Promotion rules: data type of an expression will be the same as the data type of an operand whose type has the highest precision.
        // Type casting are of two types: explicit, implicit
        // Explicit: (<data type>) <expression>
        float valueFloat = (float)x / 3;
        System.out.println(valueFloat);
        int valueInt = (int) (x / y * 3.0);
        System.out.println(valueInt);
        // Implicit: using promotion rules
        valueFloat = 3 + 5; // promotion allowed
        // valueInt = 3.5; // demotion not allowed
        
        // Java Constants
        final double PI = 3.14159;
        final int MONTH_IN_YEAR = 12;
        
        // Display numerical values
        int num = 15;
        System.out.print(num);
        System.out.print(" ");
        System.out.println(10);
        // Evaluation goes left to right
        // <value> + <value> is addition
        // <value> + <str> or vice versa is a concatenation.
        System.out.println("test" + 1 + 2);
        System.out.println(1 + 2 + "test");
        
        // DecimalFormat class
        double valueDouble = 123.45789345;
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.println(valueDouble);
        System.out.println(decimalFormat.format(valueDouble));
        
        // Scanner numerical values
        // for byte, scanner.nextByte()
        // for double, scanner.nextDouble()
        // for float, scanner.nextFloat()
        // for int, scanner.nextInt()
        // for long, scanner.nextLong()
        // for short, scanner.nextShort()
        // for String, scanner.next()
        
        // Math class
        // Some useful methods: exp(a), log(a), floor(a), ceil(a), max(a, b), min(a, b), pow(a, b), sqrt(a), sin(a), toRadians(a)
        valueDouble = Math.sqrt(Math.max(x, y) + 12.4);
        System.out.println(decimalFormat.format(valueDouble));
        
        // Random class
        Random random = new Random();
        // returns a random number between 0 and 10
        int rand = random.nextInt(11);
        System.out.println(rand);
        
        // return a random number from an interval [min, max]
        int min = 10, max = 15;
        rand = random.nextInt(max - min + 1) + min;
        System.out.println(rand);
        
        // Math.random() => return a floating point number between 0 and 1
        System.out.println(Math.random());
        
        // GregorianCalendar class
        // Class constants: YEAR, MONTH, DATE, DAY_OF_MONTH, DAY_OF_YEAR, HOUR, MINUTE, AM_PM
        
        GregorianCalendar today, independenceDay;
        today = new GregorianCalendar();
        independenceDay = new GregorianCalendar(1971, 2, 26); // Jan is 0
        
        System.out.println(today.get(GregorianCalendar.AM_PM));
    }
}

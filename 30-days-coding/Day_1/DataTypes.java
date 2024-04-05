import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double t = scan.nextDouble();
        scan.nextLine();
        String r = scan.nextLine();
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.
        System.out.println(i + j);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d + t);
        /* Print the sum of the double variables on a new line. */
        System.out.println(s + r);
        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */

        scan.close();
    }
}
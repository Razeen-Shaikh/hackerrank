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
        System.out.println(i + j);
        System.out.println(d + t);
        System.out.println(s + r);

        scan.close();
    }
}
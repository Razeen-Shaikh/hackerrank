import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int t = 0, count = 0;
        int s = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        while (n != 0) {
            t = n % 2;
            if (t == 1) {
                count++;
                if (count >= s)
                    s = count;
            } else
                count = 0;
            n = n / 2;
        }
        System.out.println(s);
    }
}

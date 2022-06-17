import java.io.*;
import java.util.*;

public class RunningTimeAndComplexity {

    public static String isPrime(int n) {
        if (n == 1) {
            return "Not prime";
        }
        if (n == 2) {
            return "Prime";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
    }
}

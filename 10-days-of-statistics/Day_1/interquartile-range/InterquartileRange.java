import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InterquartileRange {

    public static double calcMedian(List<Integer> l, int n) {
        double median = 0.0;
        if (n % 2 == 0) {
            median = (double) (l.get(n / 2 - 1) + l.get(n / 2)) / 2;
            return median;
        } else {
            median = (double) l.get(n / 2);
            return median;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> F = new ArrayList<>();
        List<Integer> S = new ArrayList<>();
        List<Integer> lower_half = new ArrayList<>();
        List<Integer> upper_half = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            X.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            F.add(in.nextInt());
        }
		in.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < F.get(i); j++) {
                S.add(X.get(i));
            }
        }
        Collections.sort(S);
        for (int i = 0; i < (S.size() + 1) / 2; i++) {
            lower_half.add(S.get(i));
        }
        for (int i = (S.size() + 1) / 2; i < S.size(); i++) {
            upper_half.add(S.get(i));
        }
        double Q1 = calcMedian(lower_half, S.size() / 2);
        double Q3 = calcMedian(upper_half, S.size() / 2);
        if (Q3 > Q1)
            System.out.printf("%.1f", Q3 - Q1);
        else
            System.out.printf("%.1f", Q1 - Q3);
    }
}

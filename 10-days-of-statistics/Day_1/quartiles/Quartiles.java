import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Quartiles {

    public static void calcMedian(List<Integer> l, int n) {
        int median = 0;
        if(n % 2 == 0) {
            median = (l.get(n/2-1) + l.get(n/2)) / 2;
            System.out.println(median);
        } else {
            median = l.get(n/2);
            System.out.println(median);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> lower_half = new ArrayList<>();
        List<Integer> upper_half = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            x.add(in.nextInt());
        }
		in.close();
        Collections.sort(x);
        for(int i = 0; i < (n+1)/2; i++) {
            lower_half.add(x.get(i));
        }
        for(int i = (n+1)/2; i < n; i++) {
            upper_half.add(x.get(i));
        }
        calcMedian(lower_half, n/2);
        calcMedian(x, n);
        calcMedian(upper_half, n/2);
    }
}
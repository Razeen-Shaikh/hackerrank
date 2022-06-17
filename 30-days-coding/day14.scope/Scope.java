import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] elements) {
            this.elements = elements;
    }

    public void computeDifference() {
        int min = elements[0], max = 0;
        for(int j = 0; j < elements.length; j++) {
            if(min > elements[j]) {
                min = elements[j];
            } else {
                if(max < elements[j]) {
                    max = elements [j];
                }
            }
            maximumDifference = max - min;
        }
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String temp = "";
        for (int j = 1; j <= s.length() - k; j++) {
            temp = s.substring(j, j + k);
            int small = temp.compareTo(smallest);
            int large = temp.compareTo(largest);
            if (small <= -1)
                smallest = temp;
            if (large >= 1)
                largest = temp;
            temp = "";
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

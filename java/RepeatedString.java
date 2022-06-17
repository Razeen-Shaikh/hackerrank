import java.io.*;
import java.util.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0, scount = 0;
        String t = s;
        long len = s.length();
        if(s.length() == 1) {
            if(s.charAt(0) == 'a') {
                count = n;
            }
        } else {
            for(int i = 0; i < len; i++) {
                if(s.charAt(i) == 'a') {
                    scount++;
                }
            }
            long rem = n % len;
            count = scount;
            while(len != (n-rem)) {
                s += t;
                count += scount;
                len = s.length();
            }
            for(int i = 0; i < rem; i++) {
                s += s.charAt(i);
            }
            if(rem != 0) {
                for(long i = (s.length() - rem); i < n; i++) {
                    if(s.charAt(0) == 'a') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegExPatternsAndIntroToDatabases {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt(), k = 0;
        String[] names = new String[N];
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);
            if (m.find()) {
                names[k++] = firstName;
            }
        }
        String[] names2 = new String[k];
        System.arraycopy(names, 0, names2, 0, k);

        Arrays.sort(names2);

        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }

        scanner.close();
    }
}

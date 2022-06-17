import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        int i = A.compareTo(B);
        if (i >= 1)
            System.out.println("Yes");
        else
            System.out.println("No");
        String a = A.substring(0, 1).toUpperCase();
        String b = B.substring(0, 1).toUpperCase();
        A = a + A.substring(1);
        B = b + B.substring(1);
        System.out.print(A + " " + B);
    }
}

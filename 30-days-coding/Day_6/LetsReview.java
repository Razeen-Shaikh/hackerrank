import java.util.Scanner;

public class LetsReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String S = in.next();
            String t = "", s = "";
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0)
                    t += S.charAt(j);
                else
                    s += S.charAt(j);
            }
            System.out.println(t + " " + s);
        }
        in.close();
    }
}

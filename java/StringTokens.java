import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.equals("") || s.trim().equals("")) {
            System.out.println(0);
        } else {
            String[] items = s.trim().split("[ !,?.\\_'@]+");
            System.out.println(items.length);
            for (String item : items) {
                System.out.println(item);
            }
        }
        scan.close();
    }
}
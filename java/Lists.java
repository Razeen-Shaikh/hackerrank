import java.util.*;

public class Lists {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String s = in.next();
            if (s.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                list.add(x, y);
            }
            if (s.equals("Delete")) {
                int x = in.nextInt();
                list.remove(x);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }
}

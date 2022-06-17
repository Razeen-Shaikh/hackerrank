import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Da = in.nextInt(), Ma = in.nextInt(), Ya = in.nextInt();
        int De = in.nextInt(), Me = in.nextInt(), Ye = in.nextInt();
        int fine = 0;
        if (Ya == Ye) {
            if (Ma == Me) {
                if (Da > De)
                    fine = 15 * (Da - De);
            } else if (Ma > Me)
                fine = 500 * (Ma - Me);
        } else if (Ya > Ye)
            fine = 10000;
        System.out.println(fine);
    }
}

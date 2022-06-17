import java.util.*;
import java.math.*;

public class BigIntegers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
        System.out.print(a.multiply(b));

    }
}

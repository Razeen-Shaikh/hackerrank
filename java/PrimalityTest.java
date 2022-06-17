import java.math.*;
import java.util.*;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInt = new BigInteger(n);
        System.out.print(bigInt.isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MeanMedianAndMode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum = 0;
        List<Double> X = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            X.add(in.nextDouble());
        }
        in.close();
        for (int i = 0; i < N; i++) {
            sum += X.get(i);
        }
        double mean = sum / N;
        Collections.sort(X);
        double median = 0;
        if (N % 2 == 0)
            median = (X.get(N / 2 - 1) + X.get(N / 2)) / 2.0;
        else
            median = X.get((N + 1) / 2);
        double mode = X.get(0);
        int occur = Collections.frequency(X, X.get(0));
        for (int i = 1; i < N; i++) {
            int temp = Collections.frequency(X, X.get(i));
            if (occur < temp) {
                mode = X.get(i);
                occur = temp;
            }
        }
        System.out.println(mean);
        System.out.println(median);
        System.out.println(Math.round(Math.floor(mode)));
    }
}

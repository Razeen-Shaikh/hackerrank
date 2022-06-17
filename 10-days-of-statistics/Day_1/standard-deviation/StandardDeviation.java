import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum = 0;
		double sd_sum = 0;
		int N = in.nextInt();
		List<Double> X = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			X.add(in.nextDouble());
			sum += X.get(i);
		}
		in.close();
		double mean = sum / N;
		for (int i = 0; i < N; i++) {
			sd_sum += ((X.get(i) - mean) * (X.get(i) - mean));
		}
		double sd = sd_sum / N;
		System.out.printf("%.1f", Math.sqrt(sd));
	}
}
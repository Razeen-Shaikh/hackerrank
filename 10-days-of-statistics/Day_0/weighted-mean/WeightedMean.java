import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedMean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double m_sum = 0;
		double sum = 0;
		List<Double> X = new ArrayList<>();
		List<Double> W = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			X.add(in.nextDouble());
		}
		for (int i = 0; i < N; i++) {
			W.add(in.nextDouble());
		}
		in.close();
		for (int i = 0; i < N; i++) {
			m_sum += (X.get(i) * W.get(i));
			sum += W.get(i);
		}
		double w_mean = m_sum / sum;
		System.out.printf("%.1f", w_mean);
	}
}
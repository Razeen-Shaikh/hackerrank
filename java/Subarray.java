import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += array[j];
                if (sum < 0)
                    count++;
            }
        }
        System.out.print(count);
    }
}

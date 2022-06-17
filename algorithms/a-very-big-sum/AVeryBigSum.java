import java.util.*;

class AVeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = in.nextInt();
        int arr[] = new int[N];
        long sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        in.close();
        System.out.println(sum);
    }
}
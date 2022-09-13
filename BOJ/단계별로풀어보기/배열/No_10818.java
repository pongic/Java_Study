package BOJ.단계별로풀어보기.배열;
import java.util.Scanner;
public class No_10818 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] A = new int[N];
        int max = 0;
        int min;

        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] >= max)
                max = A[i];
        }
        min = max;
        for (int i = 0; i < N; i++) {
            if (A[i] <= min)
                min = A[i];
        }
        System.out.println(min + " " + max);
    }
}

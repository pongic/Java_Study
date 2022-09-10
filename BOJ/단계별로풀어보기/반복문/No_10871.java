package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;

public class No_10871 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        for (int j = 0; j < N; j++) {
            if (A[j] < X) {
                System.out.print(A[j] + " ");
            }
        }
    }
}

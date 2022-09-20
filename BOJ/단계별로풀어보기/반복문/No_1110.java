package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;
public class No_1110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.close();
        int count = 0;

        int temp = N;
        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if (temp == N) break;
        }
        System.out.println(count);

    }
}

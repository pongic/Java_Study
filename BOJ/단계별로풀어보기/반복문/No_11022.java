package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;
public class No_11022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int index = 1; index <= T; index++) {
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", index , A, B, A + B);
        }
    }
}

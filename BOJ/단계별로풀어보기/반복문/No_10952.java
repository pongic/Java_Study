package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;

public class No_10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int A = input.nextInt();
            int B = input.nextInt();
            if (A + B == 0)
                break;
            else {
                System.out.println(A + B);
            }
        }

    }
}

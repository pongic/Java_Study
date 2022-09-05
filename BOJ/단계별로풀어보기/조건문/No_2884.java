package BOJ.단계별로풀어보기.조건문;
import java.util.Scanner;

public class No_2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int H = input.nextInt();
        int M = input.nextInt();

        if (M < 45) {
            H = H - 1;
            M = 60 - 45 + M;
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H + " " + (M - 45));
        }
    }
}

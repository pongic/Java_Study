package BOJ.단계별로풀어보기.조건문;
import java.util.Scanner;

public class No_2525 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if (B + C >= 60) {
            A = A + ((B + C) / 60);
            B = (B + C) % 60;
            if (A >= 24) {
                A = A % 24;   // 23시 00분에서 120분이 추가되었을 때 1 00 이 출력 되어야 한다
            }
            System.out.println(A + " " + B);
        }
        else
            System.out.println(A + " " + (B + C));
    }
}

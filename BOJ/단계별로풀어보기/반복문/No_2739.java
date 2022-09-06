package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;
public class No_2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n",num, i, num * i);
        }
    }
}

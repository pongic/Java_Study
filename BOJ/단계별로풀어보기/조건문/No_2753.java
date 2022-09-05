package BOJ.단계별로풀어보기.조건문;
import java.util.Scanner;

public class No_2753 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if ((num % 4 == 0) && (num % 100 != 0 || num % 400 == 0)) {
            System.out.println('1');
        }
        else
            System.out.println('0');
    }
}

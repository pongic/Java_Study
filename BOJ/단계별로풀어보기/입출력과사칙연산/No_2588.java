package BOJ.단계별로풀어보기.입출력과사칙연산;
import java.util.Scanner;

public class No_2588 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int num3 = num1 * (num2 % 100 % 10);
        int num4 = num1 * (num2 % 100 / 10);
        int num5 = num1 * (num2 / 100);
        int num6 = num1 * num2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}

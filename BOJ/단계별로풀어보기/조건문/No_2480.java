package BOJ.단계별로풀어보기.조건문;
import java.util.Map;
import java.util.Scanner;

public class No_2480 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int result = 0;
        if (num1 == num2 && num2 == num3) {
            result = 10000 + (num1 * 1000);
        }
        else if (num1 == num2) {
            result = 1000 + (num1 * 100);
        }
        else if (num2 == num3) {
            result = 1000 + (num2 * 100);
        }
        else if (num1 == num3) {
            result = 1000 + (num1 * 100);
        }
        else {
            max = Math.max(num1,num2);
            max = Math.max(max,num3);
            result = max * 100;

        }
        System.out.println(result);
    }
}

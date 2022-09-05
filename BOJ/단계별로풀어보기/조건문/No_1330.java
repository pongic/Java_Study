package BOJ.단계별로풀어보기.조건문;
import java.util.Scanner;

public class No_1330 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if (A > B) {
            System.out.println(">");
        }
        else if (A < B) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}

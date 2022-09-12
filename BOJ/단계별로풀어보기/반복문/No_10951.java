package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;
public class No_10951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            while(input.hasNextInt()) {
                int A = input.nextInt();
                int B = input.nextInt();
                System.out.println(A + B);
            }
        input.close();
    }
}

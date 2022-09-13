package BOJ.단계별로풀어보기.반복문;
import java.util.Scanner;
public class No_1110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int NQuo, NRemain, result;
        int count = 1;

        while (true) {
            if (N < 10) {
                NQuo = 0;
                NRemain = N;
            } else {
                NQuo = N / 10;
                NRemain = N % (NQuo * 10);
            }
            result = NQuo + NRemain;
        }
//        while (true) {
//            if (N == (NRemain * 10) + AndN) {
//                System.out.println(count);
//                break;
//            }
//            else {
//                N = NRemain * 10 + AndN;
//                count++;
//            }
//        }

    }
}

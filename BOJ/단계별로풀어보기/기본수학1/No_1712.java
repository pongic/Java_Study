package BOJ.단계별로풀어보기.기본수학1;
import java.util.Scanner;
public class No_1712 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();
    int N = 1;

    while(true) {
      if ((C * N) > (A + (B * N))) {
        System.out.println(N);
        break;
      }
      else {
        N++;
      }
    }
  }
}

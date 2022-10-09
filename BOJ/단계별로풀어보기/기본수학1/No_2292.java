package BOJ.단계별로풀어보기.기본수학1;
import java.util.Scanner;
public class No_2292 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int range = 2;
    int count = 1;
    if (N == 1) System.out.println(1);
    else {
      while (range <= N) {
        range += 6 * count;
        count++;
      }
      System.out.println(count);
    }
  }

}
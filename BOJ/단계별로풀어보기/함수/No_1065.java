package BOJ.단계별로풀어보기.함수;
import java.util.Scanner;
public class No_1065 {
  public static int hansu(int num) {
    int count = 0;

    if (num < 100) return num;

    else {
      count = 99;

      for (int i = 100; i <= num; i++) {
        int hun = i / 100;
        int ten = (i / 10) % 10;
        int one = i % 10;

        if ((hun - ten) == (ten - one)) count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    System.out.println(hansu(N));
  }
}

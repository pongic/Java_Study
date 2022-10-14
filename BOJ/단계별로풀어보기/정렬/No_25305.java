package BOJ.단계별로풀어보기.정렬;
import java.util.Scanner;
import java.util.Arrays;


public class No_25305 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int k = in.nextInt();

    int[] scores = new int[N];

    for (int i = 0; i < N; i++) {
      scores[i] = in.nextInt();
    }

    Arrays.sort(scores);

    System.out.println(scores[N - k]);
  }
}

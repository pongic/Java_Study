package BOJ.단계별로풀어보기.정렬;
import java.util.Arrays;
import java.util.Scanner;
public class No_1181 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    String[] arr = new String[N];
    int[] len = new int[N];
    String[] result = new String[N];

    for (int i = 0; i < N; i++) {
      arr[i] = in.nextLine();
      len[i] = arr[i].length();
    }
    Arrays.sort(len);

    for (int i = 0; i < N; i++) {

    }

  }
}

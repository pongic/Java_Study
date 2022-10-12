package BOJ.단계별로풀어보기.정렬;
import java.io.*;
import java.util.Arrays;

public class No_2750 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    int[] arr = new int[T];

    for (int i = 0; i < T; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);

    for (int i = 0; i < T; i++) {
      System.out.println(arr[i]);
    }
  }
}

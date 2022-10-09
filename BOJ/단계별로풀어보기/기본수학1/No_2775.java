package BOJ.단계별로풀어보기.기본수학1;
import java.io.*;

public class No_2775 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    int len = 15;
    int[][] arr = new int[len][len]; // 2차원 배열 집

    // 0층의 i호에는 i명이 산다
    for (int i = 1; i < len; i++) {
      arr[0][i] = i;
    }

    for (int i = 1; i < len; i++) {
      for (int j = 1; j < len; j++) {
        arr[i][j] = arr[i][j-1] + arr[i-1][j];
      }
    }

    for (int i = 0; i < T; i++) {
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      sb.append(arr[k][n] + "\n");
    }
    System.out.println(sb);

  }
}

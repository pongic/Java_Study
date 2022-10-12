package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;

public class No_4948 {
  public static boolean[] check;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      int N = Integer.parseInt(br.readLine());
      if (N == 0) break;
      int count = 0;
      check = new boolean[2 * N + 1];
      numberCheck();
      for (int i = N + 1; i <= 2 * N; i++) {
        if (!check[i]) {
          count++;
        }
      }
      sb.append(count).append('\n');
    }
    System.out.println(sb);
  }

  public static void numberCheck() {
    check[0] = check[1] = true;

    for (int i = 2; i <= Math.sqrt(check.length); i++) {
      if (check[i]) {
        continue;
      }
      for (int j = i * i; j < check.length; j = j + i) {
        check[j] = true;
      }
    }
  }
}

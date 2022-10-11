package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
import java.util.StringTokenizer;

public class No_1929 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    for (int i = M; i <= N; i++) {
      boolean check = true;
      if (i == 1) {
        continue;
      }
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          check = false;
          break;
        }
      }
      if (check) {
        System.out.println(i);
      }
    }
  }
}

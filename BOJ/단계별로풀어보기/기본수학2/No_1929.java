package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
import java.util.StringTokenizer;

public class No_1929 {
  public static boolean[] check;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");


    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    check = new boolean[N + 1];
    numberCheck();

    StringBuilder sb = new StringBuilder();

    for (int i = M; i <= N; i++) {
      if (!check[i]) {
        sb.append(i).append('\n');
      }
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


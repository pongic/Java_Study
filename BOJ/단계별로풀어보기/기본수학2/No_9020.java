package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
public class No_9020 {
  public static boolean[] check;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    // 수 입력
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      int min = 10000;
      int index = 0;
      check = new boolean[N + 1];
      numberCheck();
      // N까지 존재하는 소수 구하기
      for (int j = 1; j <= N; j++) {
        if (!check[j]) {
          // 구한 소수를 N에서 빼기
          if (Math.abs(N - j) < min) {
            min = Math.abs(N - j);
            index = j;
          }
        }
      }
      System.out.println(index + " " + (N - index));
    }
  }
  // 소수 구하는 메서드
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

package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
public class No_9020 {
  public static boolean[] check = new boolean[10001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    numberCheck();

    int T = Integer.parseInt(br.readLine());
/*
    while (T > 0) {
      int N = Integer.parseInt(br.readLine());
      int fisrt = N / 2;
      int second = N / 2;
      T--;
      while (true) {
        // first 와 second 둘 다 소수일 경우
        if (!check[fisrt] && !check[second]) {
          sb.append(second).append(' ').append(fisrt).append('\n');
          break;
        }
        fisrt++;
        second--;
      }
    }
    System.out.println(sb);
*/


    // 수 입력
    for (int i = 0; i < T; i++) {
      int N = Integer.parseInt(br.readLine());
      int min = 10000;
      int index = 0;
      check = new boolean[N + 1];
      numberCheck();
      // N까지 존재하는 소수 구하기
      for (int j = 2; j <= N; j++) {
        if (!check[j] && !check[N-j]) {
          // 구한 소수를 N에서 빼기
          if (Math.abs(j - (N - j)) < min) {
            min = Math.abs(j - (N - j));
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

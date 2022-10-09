package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
public class No_2581 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());
    int total = 0; // 소수의 합
    int min = 999999; // 최솟값

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
        total += i;
        if (i < min) {
          min = i;
        }
      }
    }
    System.out.println(total);
    System.out.println(min);
  }
}

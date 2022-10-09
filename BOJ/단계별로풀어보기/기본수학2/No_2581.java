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
      // 1인 경우
      if (i == 1) {
        continue;
      }
      // 소수 판별
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          check = false;
          break;
        }
      }
      // 소수 총합 구하고 최솟값 구하기
      if (check) {
        total += i;
        if (i < min) {
          min = i;
        }
      }
    }
    // 소수가 없어 total값이 변하지 않은 경우
    if (total == 0) {
      System.out.println(-1);
    }
    // 소수가 있어 total 값과 min 값이 변한 경우
    else {
      System.out.println(total);
      System.out.println(min);
    }
  }
}

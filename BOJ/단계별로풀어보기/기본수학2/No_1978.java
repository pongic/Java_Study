package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
import java.util.StringTokenizer;
public class No_1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    br.readLine(); // hasMoreTokens을 사용하기 때문에 N필요 X
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    while (st.hasMoreTokens()) {
      int num = Integer.parseInt(st.nextToken());
      boolean check = true;
      // 1은 소수가 아니다
      if (num == 1) {
        continue;
      }
      // 2부터는 소수인지 판별
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          check = false;
          break;
        }
      }
      if (check) {
        count++;
      }
    }
    System.out.println(count);
  }
}

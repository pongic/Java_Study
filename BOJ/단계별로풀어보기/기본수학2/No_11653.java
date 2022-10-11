package BOJ.단계별로풀어보기.기본수학2;
import java.io.*;
public class No_11653 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int count = 2;

    while (true) {
      if (N == 1) break;
      if (N % count == 0) {
        N = N / count;
        System.out.println(count);
      }
      else if (N % count != 0) {
        count++;
      }
    }
  }
}

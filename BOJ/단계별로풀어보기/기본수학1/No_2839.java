package BOJ.단계별로풀어보기.기본수학1;
import java.io.*;

public class No_2839 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;

    int N = Integer.parseInt(br.readLine());

    while (true) {
      // N이 음수일 경우 -1출력 하면서 종료
      if (N < 0) {
        count = -1;
        break;
      }
      // N이 5로 나누어지는 경우
      if (N % 5 == 0) {
        count += N / 5;
        break;
      }
      // N이 5로 나누어지지 않는 경우 N을 3씩 빼고 COUNT 증가
      else {
        N -= 3;
        count++;
      }
    }
    System.out.println(count);

  }
}

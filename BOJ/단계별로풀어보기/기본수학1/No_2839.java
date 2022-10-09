package BOJ.단계별로풀어보기.기본수학1;
import java.io.*;

public class No_2839 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] bag = {5, 3};
    int count = 0;
    int result = 0;

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < bag.length; i++) {
      if (N > 0) {
        count = N / bag[i];
        result += count;
        N = N - (bag[i] * count);
      }
    }
    System.out.println(result);
  }
}

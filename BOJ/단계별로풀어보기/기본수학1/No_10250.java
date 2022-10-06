package BOJ.단계별로풀어보기.기본수학1;
import java.io.*;
import java.util.StringTokenizer;

public class No_10250 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i ++) {
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      int H = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());

      int Y = N % H;
      int X = N / H + 1;

      if (N % H == 0) {
        Y = H;
        X = N / H;
      }
      System.out.println(Y * 100 + X);
    }
  }
}

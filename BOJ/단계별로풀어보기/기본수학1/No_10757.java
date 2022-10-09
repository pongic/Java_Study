package BOJ.단계별로풀어보기.기본수학1;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No_10757 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    BigInteger A = new BigInteger(st.nextToken());
    BigInteger B = new BigInteger(st.nextToken());
    BigInteger result = A.add(B);

    System.out.println(result.toString());
  }
}

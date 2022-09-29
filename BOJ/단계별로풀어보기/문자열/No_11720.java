package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_11720 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    String input = in.next();
    in.close();
    int sum = 0;
    for (int i = 0; i < N; i++) {
      sum += input.charAt(i) - '0';
    }
    System.out.println(sum);
  }
}

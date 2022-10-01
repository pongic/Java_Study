package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_2675 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();
    for (int i = 1; i <= T; i++) {
      int R = in.nextInt();
      String S = in.next();  // nextLine()으로 쓰게 되면 공백까지 읽어온다.

      for (int j = 0; j < S.length(); j++) {
        for (int k = 0; k < R; k++) {
          char ch = S.charAt(j);
          System.out.print(ch);
        }
      }
      System.out.println();
    }
  }
}

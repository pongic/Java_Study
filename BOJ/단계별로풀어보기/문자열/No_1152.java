package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No_1152 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();
    in.close();

    StringTokenizer st = new StringTokenizer(str, " ");

    System.out.println(st.countTokens());
  }
}

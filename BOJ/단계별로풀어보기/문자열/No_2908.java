package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_2908 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A = in.nextInt();
    int B = in.nextInt();

    A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
    B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

    if (A > B) {
      System.out.println(A);
    }
    else System.out.println(B);
  }
}

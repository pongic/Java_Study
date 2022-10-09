package BOJ.단계별로풀어보기.기본수학1;
import java.util.Scanner;
public class No_1193 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int X = in.nextInt();

    int count = 0; // 분수 개수
    int line = 0; // 행 번호

    while (true) {
      line++;
      count += line;
      if (count >= X) {
        if (line % 2 == 0) {
          System.out.println(X - count + line + "/" + (count - X + 1));
        }
        else {
          System.out.println((count - X + 1) + "/" + (X - count +line));
        }
        break;
      }
    }
  }
}

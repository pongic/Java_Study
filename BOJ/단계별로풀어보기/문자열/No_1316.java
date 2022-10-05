package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_1316 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int count = 0;

    for (int i = 0; i < N; i++) {
      String str = in.next();
      boolean[] alphabet = new boolean[26];
      boolean check = true;

      for (int j = 0; j < str.length(); j++) {
        int index = str.charAt(j) - 'a';
        if (alphabet[index]) {
          if (str.charAt(j) != str.charAt(j - 1)) {
            check = false;
            break;
          }
        }
        else {
          alphabet[index] = true;
        }
      }
      if (check) count++;
    }
    System.out.println(count);
  }
}

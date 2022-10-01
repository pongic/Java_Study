package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_10809 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String S = in.nextLine();
    char[] charS = S.toCharArray();
    int[] result = new int[26];
    for (int i = 0; i < result.length; i++) {
      result[i] = -1;
    }

    for (int i = 0; i < charS.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        if (charS[i] == alphabet[j]) {
          result[j] = i;
        }
        else continue;
      }
    }

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

  }
}

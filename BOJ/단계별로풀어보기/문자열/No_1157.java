package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;

public class No_1157 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next().toUpperCase();

    int[] alphabet = new int[26];
    int num = 0;
    int max = 0;
    char result = '?';

    for (int i = 0; i < S.length(); i++) {
      num = S.charAt(i) - 'A';
      alphabet[num]++;
    }

    for (int i = 0; i < alphabet.length; i++) {
      if (alphabet[i] > max) {
        max = alphabet[i];
        result = (char)(i+'A');
      }
      else if (max == alphabet[i]) {
        result = '?';
      }
    }
    System.out.println(result);
  }
}

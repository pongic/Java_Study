package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_5622 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();
    char[] arrStr = str.toCharArray();
    int second = 0;
    int total = 0;

    for (int i = 0; i < arrStr.length; i++) {
      switch (arrStr[i]) {
        case 'A' : case 'B' : case 'C' :
          second = 3;
          total += second;
          break;
        case 'D' : case 'E' : case 'F' :
          second = 4;
          total += second;
          break;
        case 'G' : case 'H' : case 'I' :
          second = 5;
          total += second;
          break;
        case 'J' : case 'K' : case 'L' :
          second = 6;
          total += second;
          break;
        case 'M' : case 'N' : case 'O' :
          second = 7;
          total += second;
          break;
        case 'P' : case 'Q' : case 'R' : case 'S' :
          second = 8;
          total += second;
          break;
        case 'T' : case 'U' : case 'V' :
          second = 9;
          total += second;
          break;
        case 'W' : case 'X' : case 'Y' : case 'Z' :
          second = 10;
          total += second;
          break;
      }
    }
    System.out.println(total);
  }
}

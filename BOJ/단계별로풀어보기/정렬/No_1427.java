package BOJ.단계별로풀어보기.정렬;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No_1427 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();

    String num = Integer.toString(N);
    String[] numArr = num.split("");

    Arrays.sort(numArr,Comparator.reverseOrder());
    String result = String.join("",numArr);

    System.out.println(result);
  }
}

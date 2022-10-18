package BOJ.단계별로풀어보기.정렬;
import java.util.Arrays;
import java.util.Scanner;
public class No_2108 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] numbers = new int[N];
    double sum = 0;

    for (int i = 0; i < N; i++) {
      numbers[i] = in.nextInt();
      sum += numbers[i];
    }
    Arrays.sort(numbers);

    // 최빈값
    int count = 0;
    int max = -1;
    int tmp = numbers[0];
    boolean check = false;

    for (int i = 0; i < N - 1; i++) {
      if (numbers[i] == numbers[i + 1]) {
        count++;
      }
      else {
        count = 0;
      }

      if (max < count) {
        max = count;
        tmp = numbers[i];
        check = true;
      }
      else if (max == count && check == true) {
        tmp = numbers[i];
        check = false;
      }
    }

    System.out.println(Math.round(sum / N));
    System.out.println(numbers[(N - 1) / 2]);
    System.out.println(tmp);
    System.out.println(numbers[numbers.length - 1] - numbers[0]);
  }
}

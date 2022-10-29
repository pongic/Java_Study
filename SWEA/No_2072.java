package SWEA;

import java.util.Scanner;

public class No_2072 {
    public static void main(String args[]) throws Exception {
      Scanner in = new Scanner(System.in);
      int T = in.nextInt();
      for (int i = 1; i <= T; i++) {
        int[] arr = new int[10];
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
          arr[j] = in.nextInt();
          if (arr[j] % 2 != 0) {
            sum += arr[j];
          }
        }
        System.out.printf("#%d %d\n", i, sum);
      }
    }
}

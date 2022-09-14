package BOJ.단계별로풀어보기.배열;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class No_3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            arr[i] = arr[i] % 42;
        }

        for (int arrs : arr) {
        }


    }
}

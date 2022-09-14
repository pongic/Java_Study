package BOJ.단계별로풀어보기.배열;
import java.util.Arrays;
import java.util.Scanner;
public class No_2562 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        max = arr[8];


        System.out.println(max);
        System.out.println(index);

    }
}

package BOJ.단계별로풀어보기.배열;
import java.util.Arrays;
import java.util.Scanner;

public class No_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        double arr[] = new double[N];
        double newArr[] = new double[N];
        double max = 0.0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = ((arr[i] / max) * 100);
            sum += newArr[i];
        }
        System.out.print(sum / arr.length);
    }
}

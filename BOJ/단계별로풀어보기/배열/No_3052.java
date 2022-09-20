package BOJ.단계별로풀어보기.배열;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class No_3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(input.nextInt() % 42);
        }
        input.close();
        System.out.println(hashSet.size());
    }
}

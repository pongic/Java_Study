package BOJ.단계별로풀어보기.배열;
import java.util.Scanner;

public class No_8958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 테스트 케이스 입력 받은 후 배열 선언
        String[] arr = new String[input.nextInt()];
        // String 배열에 값 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }

    }
}

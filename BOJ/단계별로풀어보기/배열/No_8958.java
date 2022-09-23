package BOJ.단계별로풀어보기.배열;
import java.util.Scanner;

public class No_8958 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       // 입력 받을 배열 크기 선언
        String[] arr = new String[in.nextInt()];

        // 배열 값 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        // 배열 순회
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // 연속 횟수
            int sum = 0; // 총 합
            // 각 배열 요소 순회
            for (int j = 0; j < arr[i].length(); j++) {
                // 배열의 요소가 O일 떄 count 증가
                if (arr[i].charAt(j) == 'O') {
                    count++;
                }
                else {
                    count = 0; // 배열의 요소가 O이 아닐 때에는 연속 횟수 초기화
                }
                sum += count;
            }
            System.out.println(sum);
        }

    }
}

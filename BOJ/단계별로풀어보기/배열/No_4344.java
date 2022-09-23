package BOJ.단계별로풀어보기.배열;
import java.util.Scanner;
public class No_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 테스트 케이스 입력 받기
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            int N = in.nextInt(); // 학생 수 입력 받기
            int[] arr = new int[N];
            double sum = 0; // 성적 합
            for (int j = 0; j < arr.length; j++) {
                arr[j] = in.nextInt(); // 학생 성적 입력
                sum += arr[j];
            }
            double avg = sum / arr.length;
            double count = 0; // 평균 넘는 학생 수

            // 평균 넘는 학생 수 조회
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > avg) count++;  // 평균이 넘었을 때 count 증가
            }
            System.out.printf("%.3f%%\n",(count / N) * 100);
        }
        in.close();
    }
}

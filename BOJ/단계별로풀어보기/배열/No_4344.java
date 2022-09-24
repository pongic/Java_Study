package BOJ.단계별로풀어보기.배열;
import java.util.Scanner;
public class No_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCase = in.nextInt();  // 테스트 케이스 입력
        for (int i = 0; i < testCase; i++) {
            int N = in.nextInt();  // 학생 수 입력
            int[] scores = new int[N]; // 학생 점수 입력 할 배열 생성

            double sum = 0;
            double avg = 0; // 평균
            double count = 0; // 평균 넘는 학생 있을 때 증가

            for (int j = 0; j < N; j++) {
                scores[j] = in.nextInt();  // 학생 점수 입력
                sum += scores[j];  // 학생 점수 합
            }

            avg = (double) sum / N;

            for (int k = 0; k < N; k++) {  // 학생 점수랑 평균 비교
                if (scores[k] > avg) count++;
            }
            System.out.printf("%.3f%%\n",(count / N) * 100);
        }
    }
}

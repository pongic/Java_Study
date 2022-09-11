package BOJ.단계별로풀어보기.반복문;
//import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class No_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 스페이스바를 기준으로 문자열 분리

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N; j++) {
            if (A[j] < X) {
                bw.write(A[j] + " ");
            }
        }
        bw.flush();
        bw.close();
        /*
        //스캐너 입력 사용
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        for (int j = 0; j < N; j++) {
            if (A[j] < X) {
                System.out.print(A[j] + " ");
            }
        }

         */
    }
}

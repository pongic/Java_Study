package BOJ.단계별로풀어보기.반복문;
//import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class No_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
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

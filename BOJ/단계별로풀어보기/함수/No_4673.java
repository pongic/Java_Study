package BOJ.단계별로풀어보기.함수;

public class No_4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);
            if (n < 10001) arr[n] = true;
        }
        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) System.out.println(i);
        }
    }
    public static int d(int number) {
       int sum = number;
        return sum;
    }

}

package BOJ.단계별로풀어보기.함수;

public class No_15596 {
    public long sum (int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;

    }
}

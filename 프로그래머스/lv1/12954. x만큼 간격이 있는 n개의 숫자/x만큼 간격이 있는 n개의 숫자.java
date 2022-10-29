class Solution {
    public long[] solution(int x, int n) {
        long[] result = new long[n];
        result[0] = x;
        for (int i = 0; i < n - 1; i++) {
            result[i + 1] = result[i] + x;
        }
        return result;
    }
}
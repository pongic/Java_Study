class Solution {
    public int solution(int left, int right) {
        // 약수 개수 확인
        int result = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
      
        return result;
    }
}
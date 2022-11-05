class Solution {
    public long solution(int price, int money, int count) {
        // 금액 더해주기
        long result = 0;
        for (int i = 1; i <= count; i++) {
            result += price * i;
        }
        // 금액이 money보다 부족하지 않은 경우
        if (result > money) {
            result = result - (long)money;
            return result;
        }
        else {
            return 0;
        }
    }
}
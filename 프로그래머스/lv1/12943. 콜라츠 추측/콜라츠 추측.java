class Solution {
    public int solution(int num) {
        int count = 0;
        long result = (long)num;
        while (result > 1) {
            if (result % 2 == 0) {
                result = result / 2;
            }
            else {
                result = result * 3 + 1;
            }
            count++;
        }
        if (count > 500) {
            return -1;
        }
        else {
            return count;
        } 
    }
}
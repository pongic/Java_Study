class Solution {
    public boolean solution(int x) {
        int answer = 0;
        int num = x;
        while (x > 0) {
            answer += x % 10;
            x = x / 10;
        }
        
        if (num % answer == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
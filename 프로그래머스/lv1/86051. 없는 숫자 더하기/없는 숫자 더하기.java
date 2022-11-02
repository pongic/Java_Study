import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!contains(numbers,i)) {
                answer += i;
            }
        }
        return answer;
    }
    
    public boolean contains(int[] arr, int num) {
        return Arrays.stream(arr).anyMatch(n -> n == num);
    }
}
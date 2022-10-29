import java.util.*;
class Solution {
    public long solution(long n) {
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num);
        
        StringBuilder sb = new StringBuilder();
        for (String i : num) {
            sb.append(i);
        }
        long answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}
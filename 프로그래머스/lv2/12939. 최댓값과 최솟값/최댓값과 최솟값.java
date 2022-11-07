import java.util.*;
import java.util.stream.Stream;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] result = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        answer = result[0] + " " + result[result.length - 1];
        return answer;
    }
}
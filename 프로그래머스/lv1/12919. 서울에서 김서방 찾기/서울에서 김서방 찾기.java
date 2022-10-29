import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        String result = "";
        int idx = Arrays.asList(seoul).indexOf("Kim");
        result = "김서방은 " + idx + "에 있다";
        return result;
    }
}
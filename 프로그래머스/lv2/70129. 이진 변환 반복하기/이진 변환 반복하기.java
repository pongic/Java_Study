import java.util.*;
class Solution {
  public int[] solution(String s) {
    int count = 0;
    int count2 = 0;
    // 문자열이 1이 될때까지 반복
    while (!s.equals("1")) {
      String tmp = "";
      // 문자열에서 0제거
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0') {
          count++;
        }
        else {
          tmp = tmp + s.charAt(i);
        }
      }
      // 문자열 길이 저장할 변수
      int len = tmp.length();
      // 문자열 길이 변수 이진 변환 저장할 문자열
      s = Integer.toBinaryString(len);
      count2++;
    }
    int[] answer = {count2, count};
    return answer;
  }
}
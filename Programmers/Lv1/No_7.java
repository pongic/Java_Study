package Programmers.Lv1;

public class No_7 {
    public static boolean solution(String s) {
      boolean answer = true;
      s = s.toLowerCase();

      int pCount = 0;
      int yCount = 0;

      for (int i = 0; i< s.length(); i++) {
        if (s.charAt(i) == 'p') {
          pCount++;
        } else if (s.charAt(i) == 'y') {
          yCount++;
        }
      }
      if (pCount == yCount) {
        answer = true;
      }
      else if (pCount == 0 & yCount == 0) {
        answer = true;
      }
      else {
        answer = false;
      }

      return answer;
    }

  public static void main(String[] args) {
    String s = "pPoooyY";
    System.out.println(solution(s));
  }
}

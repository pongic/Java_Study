package Programmers.Lv1;

public class No_10 {
  public int solution(String s) {
    boolean sign = true;
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '-') {
        sign = false;
      } else if (ch != '+') {
        result = result * 10 + (ch - '0');
      }
    }
    return sign ? 1 : -1 * result;
    /*
     int num = Integer.parseInt(s);
     return num;
     */

  }

  public static void main(String[] args) {
    No_10 no = new No_10();
    System.out.println(no.solution("-1234"));
  }
}

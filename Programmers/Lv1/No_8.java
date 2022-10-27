package Programmers.Lv1;

public class No_8 {
  public static int solution(int n) {
    int answer = 0;
    int min = 1000000;
    for (int i = 1; i <= n; i++) {
      if (n % i == 1) {
        answer = i;
        if (min > answer) {
          min = answer;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution(10));
  }
}

package Programmers.Lv1;

public class No_9 {
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

  public static void main(String[] args) {
    No_9 sn = new No_9();
    System.out.println(sn.solution(13));
  }
}

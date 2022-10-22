package Programmers.Lv1;

public class No_2 {
  public double solution(int[] arr) {
    double answer = 0;
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }
    answer = answer / arr.length;
    return answer;
  }
}

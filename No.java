package Programmers.Java_Study;

class No {
  public String solution(int num) {
    String answer = "";
    if (num % 2 == 0) {
      answer = "Even";
    }
    else {
      answer = "Odd";
    }
    return answer;
  }
}

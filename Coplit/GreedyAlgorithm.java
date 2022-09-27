package Coplit;

import java.util.Arrays;

public class GreedyAlgorithm {
  public static int movingStuff(int[] stuff, int limit) {
    Arrays.sort(stuff);  // 배열 오름차순 정렬
    int leftIndex = 0;  // 왼쪽 인덱스
    int rightIndex = stuff.length - 1;  // 오른쪽 인덱스
    int count = 0;  // 2개 동시에
    // 왼쪽부터 시작하는 인덱스와 오른쪽부터 시작하는 인덱스의 값이 같아지면 종료
//    while ()
      // 첫 번째(왼쪽) 인덱스와 마지막(오른쪽) 인덱스의 합이 limit보다 작으면 인덱스 증가

      // 그 외에 경우는 오른쪽 인덱스만 감소
  }

  public static void main(String[] args) {
    int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
    System.out.println(output);
  }
}

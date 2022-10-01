package Coplit;

import java.util.Arrays;

public class GreedyMovingStuff {
  public static int movingStuff(int[] stuff, int limit) {
    int leftIdx = 0;
    int rightIdx = stuff.length -1;
    int count = 0;

    Arrays.sort(stuff);

    while (leftIdx <= rightIdx) {
      if (stuff[leftIdx] + stuff[rightIdx] <= limit) {
        count++;
        leftIdx++;
        rightIdx--;
      }
      else {
        rightIdx--;
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
    System.out.println(output);
  }
}

package Coplit;
import java.util.*;
public class BoardGame {
  public static Integer boardGame(int[][] board, String operation) {
    HashMap<Character, int[]> hashMap = new HashMap<>();
    hashMap.put('R',new int[]{0, 1});
    hashMap.put('L',new int[]{0, -1});
    hashMap.put('U',new int[]{-1, 0});
    hashMap.put('D',new int[]{1, 0});

    int totalX = 0;
    int totalY = 0;
    int score = 0;

    char[] operChr = operation.toCharArray();

    for (int i = 0; i < operChr.length; i++) {
      int y = hashMap.get(operChr[i])[1];
      int x = hashMap.get(operChr[i])[0];
      totalX += x;
      totalY += y;

      if (!isNull(totalX, totalY, board.length)) return null;
      score += board[totalX][totalY];
    }
    return score;
  }

  public static boolean isNull(int x, int y, int len) {
    if (0 <= x && x < len && 0 <= y && y < len) {
      return true;
    }
    else return false;
  }

  public static void main(String[] args) {
    int[][] board1 = new int[][]{
        {0, 0, 0, 1},
        {1, 1, 1, 0},
        {1, 1, 0, 0},
        {0, 0, 0, 0}
    };
    int output1 = boardGame(board1, "RRDLLD");
    System.out.println(output1);
  }
}

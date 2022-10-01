package Coplit;

public class GreedyPartTimeJob {
  public static int partTimeJob(int k) {
    int[] coin = {500, 100, 50, 10, 5, 1};
    int count = 0;
    int result = 0;

    for (int i = 0; i < coin.length; i++) {
      if (k > 0) {
        count = k / coin[i];
        k = k - (coin[i] * count);
        result = result + count;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int output1 = partTimeJob(4972);
    System.out.println(output1);
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      int num = in.nextInt();
      if (num == 0) {
        break;
      }
      else {
        int count = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length() / 2; i++) {
          if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            count++;
          }
        }
        if (count == str.length() / 2) {
          System.out.println("yes");
        }
        else {
          System.out.println("no");
        }
      }
    }
  }
}
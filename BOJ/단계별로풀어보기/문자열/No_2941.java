package BOJ.단계별로풀어보기.문자열;
import java.util.Scanner;
public class No_2941 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String str = in.nextLine();
    String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

    for (int i = 0; i < arr.length; i++) {
      if (str.contains(arr[i])) {
        str = str.replace(arr[i],"0");
      }
    }
    System.out.println(str.length());
  }
}

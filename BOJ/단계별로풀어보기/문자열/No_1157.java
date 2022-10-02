package BOJ.단계별로풀어보기.문자열;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class No_1157 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Character> list = new ArrayList<>();
    List<Character> newList = new ArrayList<>();
    int idx = 0;
    int max = 0;
    int maxIdx = 0;

    String S = in.nextLine();
    String subS = S.toUpperCase();

    for (int i = 0; i < subS.length(); i++) {
      list.add(subS.charAt(i));
    }
    newList = list.stream().distinct().collect(Collectors.toList());
    int[] count = new int[newList.size()];

   for (int i = 0; i < newList.size(); i++) {
     for (int j = 0; j < subS.length(); j++) {
       if (newList.get(i).equals(subS.charAt(j))) {
         idx++;
       }
     }
     count[i] = idx;
     idx = 0;
   }
   max = count[0];
   for (int i = 0; i < count.length; i++) {
     if (count[i] > max) {
       max = count[i];
       maxIdx++;
     }
   }
   for (int i = 0; i < count.length; i++) {
     if (max == count[i]) {
       System.out.println("?");
       break;
     }
     else {
       System.out.println(newList.get(maxIdx));
       break;
     }
   }
  }
}

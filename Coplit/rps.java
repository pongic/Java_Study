package Coplit;

import java.util.ArrayList;
import java.util.Arrays;

public class rps {
  public static ArrayList<String[]> rockPaperScissors (int rounds) {
    ArrayList<String[]> result = new ArrayList<>();
    return loop(rounds, new String[]{}, result);
  }

  public static ArrayList<String[]> loop (int rounds, String[] loopArr, ArrayList<String[]> result) {
     String[] rps = {"rock", "paper", "scissors"};
     if (rounds == 0) {
       result.add(loopArr);
       return result;
     }
     else {
       for (int i = 0; i < rps.length; i++) {
         String[] arr = Arrays.copyOf(loopArr,loopArr.length + 1);
         arr[arr.length -1] = rps[i];
         result = loop(rounds - 1, arr, result);
       }
     }
    return result;
  }


  public static void main(String[] args) {
    ArrayList<String[]> output = rockPaperScissors(5);
    for (int i =0; i < output.size(); i++) {
      System.out.println(Arrays.toString(output.get(i)));
    }
  }
}

package BOJ.단계별로풀어보기.정렬;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class No_2751 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < T; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(list);

    for (int el : list) {
      sb.append(el).append('\n');
    }
    System.out.println(sb);
  }
}

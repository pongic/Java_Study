import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] % divisor == 0) {
            list.add(arr[i]);
            count++;
          }
        }
        if (count == 0) return new int[]{-1};
        Collections.sort(list);
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    
    }
}
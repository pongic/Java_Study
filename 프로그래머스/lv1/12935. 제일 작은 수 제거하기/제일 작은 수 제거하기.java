import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int index = 0;
        int[] result = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[index++] = arr[i];
            }
        }
        return result;     
    }
}
import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        
    // 배열 A, B 정렬
    Arrays.sort(A);
    Arrays.sort(B);
    // 최솟값 저장할 변수
    int answer = 0;
    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[A.length - i - 1];
    }

    return answer;
    }
}
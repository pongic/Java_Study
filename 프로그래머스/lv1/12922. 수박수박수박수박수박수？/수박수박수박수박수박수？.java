class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append("박");
            }
            else {
                sb.append("수");
            }
        }
        answer = String.valueOf(sb);
        return answer;
    }
}
class Solution {
    public boolean solution(String s) {
        // 문자열 길이 확인
        boolean result = true;
        if (s.length() == 4 || s.length() == 6) {
            // 숫자로 구성되어있는지 확인
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    result = false;
                }
            }
            return result;
        }
        else {
            return false;
        }
    }
}
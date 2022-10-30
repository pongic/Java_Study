class Solution {
    public String solution(String s) {
        String result = "";
        if (s.length() % 2 != 0) {
            char ch = s.charAt(s.length() / 2);
            result = Character.toString(ch);
            return result;
        }
        else {
            char ch1 = s.charAt(s.length() / 2 - 1);
            char ch2 = s.charAt(s.length() / 2);
            result = Character.toString(ch1) + Character.toString(ch2);
            return result;
        }
    }
}
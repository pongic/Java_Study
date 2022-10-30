class Solution {
    public String solution(String s) {
        int len = s.length();
        String result = "";
        if ( len % 2 == 0 )
            result = s.substring(len / 2 - 1, (len / 2) + 1);
        else
            result = s.substring((len / 2), (len / 2) + 1);
        return result;
    }
}
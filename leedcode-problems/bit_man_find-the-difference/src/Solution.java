class Solution {
    public char findTheDifference(String s, String t) {
        char ch = 0;
        for (int i = 0; i < s.length(); i += 1) {
            ch ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i += 1) {
            ch ^= t.charAt(i);
        }
        return ch;
    }
}
import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        int result = 0, cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(')
                result = Math.max(result, ++cur);
            if (s.charAt(i) == ')')
                cur--;
        }
        return result;
    }
}
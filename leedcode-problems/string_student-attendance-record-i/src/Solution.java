class Solution {
    public boolean checkRecord(String s) {
        int co = 0, a = 0;
        for (char c : s.toCharArray()) {
            if (c == 'P' || c == 'A')
                co = 0;

            if (c == 'L')
                co++;

            if (co == 3)
                return false;
            if (c == 'A')
                a++;

            if (a >= 2)
                return false;
        }

        return true;
    }
}
public class Solution1 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int x = 0;
        int b = 1;

        while (b <= n) {
            while (x < b && x + b <= n) {
                ans[x + b] = ans[x] + 1;
                ++x;
            }
            x = 0; // reset x
            b <<= 1; // b = 2b
        }

        return ans;
    }
}
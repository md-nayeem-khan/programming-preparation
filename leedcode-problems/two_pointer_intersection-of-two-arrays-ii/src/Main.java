import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.intersect(new int[] {1,2,2,1}, new int[] {2,2});
        System.out.println(Arrays.toString(result));
    }
}

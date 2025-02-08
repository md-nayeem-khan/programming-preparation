import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,3}, {2,3}, {3,1}};
        int[][] result = solution.floodFill(grid, 1, 1, 2);
        System.out.println(Arrays.deepToString(result));
    }
}

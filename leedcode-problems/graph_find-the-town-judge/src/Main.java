
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,3}, {2,3}, {3,1}};
        int result = solution.findJudge(3, grid);
        System.out.println(result);
    }
}

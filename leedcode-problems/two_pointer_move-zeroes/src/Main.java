import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = new int[] {0,1,0,3,12};
        solution.moveZeroes(result);
        System.out.println(Arrays.toString(result));
    }
}

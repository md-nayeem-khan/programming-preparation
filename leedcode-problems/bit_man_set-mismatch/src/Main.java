import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.findErrorNums(new int[] {1,2,2,4});
        System.out.println(Arrays.toString(result));
    }
}

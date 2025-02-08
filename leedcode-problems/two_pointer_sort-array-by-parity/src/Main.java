import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParity(new int[] {3,1,2,4});
        System.out.println(Arrays.toString(result));
    }
}

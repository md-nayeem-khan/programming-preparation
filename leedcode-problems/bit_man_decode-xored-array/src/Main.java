import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.decode(new int[] {4,1,2,1,2}, 1);
        System.out.println(Arrays.toString(result));
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = new int[] {-1,-1,-100,3,99};
        boolean result = solution.containsDuplicate(test);
        System.out.println(result);
    }
}

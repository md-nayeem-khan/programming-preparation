import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        boolean result = solution1.wordBreak("leetcode", List.of("leet","code"));
        System.out.println(result);
    }
}

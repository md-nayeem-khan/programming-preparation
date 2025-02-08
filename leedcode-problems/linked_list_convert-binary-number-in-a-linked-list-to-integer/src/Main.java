public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node5 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        int result = solution.getDecimalValue(head);
        System.out.println(result);
    }
}

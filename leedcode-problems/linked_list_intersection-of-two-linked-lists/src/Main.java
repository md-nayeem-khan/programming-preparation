public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(3);
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node5;
        head2.next = node5;
        ListNode result = solution.getIntersectionNode(head, head2);
        System.out.println(result.val);
    }
}

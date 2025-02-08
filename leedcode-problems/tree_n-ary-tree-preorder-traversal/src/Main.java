import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node node = new Node(4, new ArrayList<>());
        Node node1 = new Node(2, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node3 = new Node(4, new ArrayList<>());
        Node node4 = new Node(2, new ArrayList<>());
        Node node5 = new Node(6, new ArrayList<>());
        Node node6 = new Node(1, new ArrayList<>());
        node.children.add(node1);
        node.children.add(node2);
        node.children.add(node3);
        List<Integer> result = new ArrayList<>();
        System.out.println(result);
    }
}

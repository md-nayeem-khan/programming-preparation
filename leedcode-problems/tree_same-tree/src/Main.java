public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
//        treeNode2.left = treeNode3;
//        treeNode2.right = treeNode4;
        boolean result = solution.isSameTree(treeNode, treeNode3);
        System.out.println(result);
    }
}

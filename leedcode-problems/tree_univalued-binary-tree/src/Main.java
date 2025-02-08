public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(4);
        //TreeNode treeNode5 = new TreeNode(3);
        //TreeNode treeNode6 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
//        treeNode2.left = treeNode3;
//        treeNode2.right = treeNode4;
        boolean result = solution.isUnivalTree(treeNode);
        System.out.println(result);
    }
}

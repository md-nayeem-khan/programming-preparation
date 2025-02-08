public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(10);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(15);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(3);
        //TreeNode treeNode5 = new TreeNode(3);
        //TreeNode treeNode6 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
//        treeNode2.left = treeNode3;
//        treeNode2.right = treeNode4;
        int result = solution.rangeSumBST(treeNode, 5, 15);
        System.out.println(result);
    }
}

package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0404 {
    private int sum(TreeNode root, boolean left){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null && left){
            return root.val;
        }
        return sum(root.left, true) + sum(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }
}

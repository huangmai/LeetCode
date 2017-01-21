package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0337 {
    public int rob(TreeNode root, boolean f){
        return root == null ? 0 : (f ? Integer.max(root.val + rob(root.left, false) + rob(root.right, false), rob(root.left, true) + rob(root.right, true)) : (rob(root.left, true) + rob(root.right, true)));
    }
    public int rob(TreeNode root) {
        return rob(root, true);
    }
}

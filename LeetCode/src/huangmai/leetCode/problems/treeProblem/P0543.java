package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0543 {
    private int m;
    private int f(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = f(root.left), r = f(root.right);
        m = Integer.max(m, l + r);
        return Integer.max(l, r) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        m = 0;
        f(root);
        return m;
    }
}

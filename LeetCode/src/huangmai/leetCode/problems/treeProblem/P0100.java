package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null){
            return q == null;
        }
        if(q == null || p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

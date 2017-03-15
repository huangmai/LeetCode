package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0530 {
    int min = Integer.MAX_VALUE;
    Integer p = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return min;
        }
        getMinimumDifference(root.left);
        if(p != null){
            min = Integer.min(min, root.val - p);
        }
        p = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}

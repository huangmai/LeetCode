package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int cp = Integer.signum(Integer.compare(p.val, root.val));
        if(Integer.signum(Integer.compare(q.val, root.val)) != cp){
            return root;
        }
        return cp < 0 ? lowestCommonAncestor(root.left, p, q) : lowestCommonAncestor(root.right, p, q);
    }
}

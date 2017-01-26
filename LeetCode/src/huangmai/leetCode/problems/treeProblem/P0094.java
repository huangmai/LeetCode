package huangmai.leetCode.problems.treeProblem;

import java.util.ArrayList;
import java.util.List;

import huangmai.leetCode.libClass.TreeNode;

public class P0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if(root == null){
            return r;
        }
        TreeNode c = root, n;
        while(c != null){
            if(c.left == null){
                r.add(c.val);
                c = c.right;
            }else{
                n = c.left;
                while(n.right != null && n.right != c){
                    n = n.right;
                }
                if(n.right == null){
                    n.right = c;
                    c = c.left;
                }else{
                    r.add(c.val);
                    n.right = null;
                    c = c.right;
                }
            }
        }
        return r;
    }
}

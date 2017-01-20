package huangmai.leetCode.problems.treeProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import huangmai.leetCode.libClass.TreeNode;

public class P0199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null){
            return l;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int n = 0;
        TreeNode t;
        while(!q.isEmpty()){
            t = q.poll();
            if(t == null){
                l.add(n);
                if(!q.isEmpty()){
                    q.offer(null);
                }
            }else{
                n = t.val;
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
        }
        return l;
    }
}

package huangmai.leetCode.problems.treeProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import huangmai.leetCode.libClass.TreeNode;

public class P0103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        if(root == null){
            return r;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        List<Integer> l = new LinkedList<>();
        TreeNode t;
        boolean f = false;
        while(true){
            t = q.poll();
            if(t == null){
                if(f){
                    Collections.reverse(l);
                }
                r.add(l);
                if(q.isEmpty()){
                    break;
                }
                l = new LinkedList<>();
                f = !f;
                q.offer(null);
            }else{
                l.add(t.val);
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
        }
        return r;
    }
}

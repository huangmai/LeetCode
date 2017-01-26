package huangmai.utils;

import java.util.LinkedList;
import java.util.Queue;

import huangmai.leetCode.libClass.TreeNode;

public class TreeNodeUtils {
	public static TreeNode treeFromInts(Integer ... vals){
		if(vals.length == 0 || vals[0] == null){
			return null;
		}
		TreeNode root = new TreeNode(vals[0]);
		Queue<TreeNode> pq = new LinkedList<>();
		pq.offer(root);
		pq.offer(null);
		for(int i = 1; i < vals.length; i += 2){
			if(pq.size() <= 1){
				break;
			}
			TreeNode p = pq.poll();
			if(p == null){
				p = pq.poll();
				pq.offer(null);
			}
			if(vals[i] != null){
				p.left = new TreeNode(vals[i]);
				pq.offer(p.left);
			}
			if(vals[i + 1] != null){
				p.right = new TreeNode(vals[i + 1]);
				pq.offer(p.right);
			}
		}
		return root;
	}
	
	public static String printTree(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		StringBuilder r = new StringBuilder();
		while(!q.isEmpty()){
			TreeNode t = q.poll();
			if(t == null){
				r.append("null, ");
			}else{
				r.append("" + t.val + ", ");
				q.offer(t.left);
				q.offer(t.right);	
			}			
		}
		return r.toString();
	}
}

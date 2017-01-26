package huangmai.leetCode.problems.treeProblem;

import huangmai.leetCode.libClass.TreeNode;

public class P0108 {
    private TreeNode toBST(int[] nums, int s, int e){
        if(s > e){
            return null;
        }
        int m = (s + e >> 1);
        TreeNode r = new TreeNode(nums[m]);
        r.left = toBST(nums, s, m - 1);
        r.right = toBST(nums, m + 1, e);
        return r;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }
}

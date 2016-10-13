package huangmai.leetCode.problems.arrayProblem;

public class P0027 {
    public int removeElement(int[] nums, int val) {
        int l, r;
        for(l = -1, r = 0; r < nums.length; r ++){
            if(nums[r] != val){
                nums[++ l] = nums[r];
            }
        }
        return l + 1;
    }
}

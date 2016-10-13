package huangmai.leetCode.problems.arrayProblem;

public class P0026 {
    public int removeDuplicates(int[] nums) {
        int l, r;
        for(l = 0, r = 1; r < nums.length; r ++){
            if(nums[r] != nums[r - 1]){
                nums[++ l] = nums[r];
            }
        }
        return l + 1;
   }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0031 {
    private void reverseArray(int[] nums, int i){
        for(int j = nums.length - 1, t; i < j; i ++, j --){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums.length > 1){
            int t;
            for(int i = nums.length - 2; i >=0; i --){
                t = nums[i];
                if(nums[i] < nums[i + 1]){
                    int j;
                    for(j = nums.length - 1; nums[j] <= nums[i]; j --);
                    nums[i] = nums[j];
                    nums[j] = t;
                    reverseArray(nums, i + 1);
                    return;
                }
            }
            reverseArray(nums, 0);
        }
    }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0189 {
	private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
	private void reverse(int[] nums, int s, int e){
		for(int i = s, j = e; i < j; i ++, j --){
            swap(nums, i, j);
        }
	}
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k %= l;
        reverse(nums, 0, l - k - 1);
        reverse(nums, l - k, l - 1);
        reverse(nums, 0, l - 1);
    }
}

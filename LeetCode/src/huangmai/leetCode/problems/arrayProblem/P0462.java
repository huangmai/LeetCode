package huangmai.leetCode.problems.arrayProblem;

import java.util.Arrays;

public class P0462 {
	/*
	 * Key to solve this problem is to understand about the median of an array.
	 * The result is the sum of distance to the median.
	 * If the array has even numbers then it dosen't matter which number is picked, as long as it's in [median left, median right] 
	 * */
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length >> 1], s = 0, t;
        for(int n : nums){
            t = n - m;
            s += t > 0 ? t : -t;
        }
        return s;
    }
}

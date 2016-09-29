package huangmai.leetCode.problems.arrayProblem;

import java.util.Arrays;

public class P0016 {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, m = Integer.MAX_VALUE;
        int l, r, d;
        for(int i = 0; i < n; i ++){
            for(l = i + 1, r = n - 1; l < r; ){
                d = nums[l] + nums[r] + nums[i] - target;
                if(d == 0){
                    return target;
                }
                if(Math.abs(m) > Math.abs(d)){
                    m = d;
                }
                if(d < 0){
                    l ++;
                }else{
                    r --;
                }
            }
        }
        return target + m;
    }
}

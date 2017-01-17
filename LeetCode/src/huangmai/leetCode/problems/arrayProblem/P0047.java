package huangmai.leetCode.problems.arrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0047 {
    public boolean nextPermutation(int[] nums) {
        if(nums.length > 1){
            int t;
            for(int i = nums.length - 2; i >= 0; i --){
                t = nums[i];
                if(nums[i] < nums[i + 1]){
                    int j;
                    for(j = nums.length - 1; nums[j] <= nums[i]; j --);
                    nums[i] = nums[j];
                    nums[j] = t;
                    j = nums.length - 1;
                    for(i ++; i < j; i ++, j --){
                        t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(nums);
        do{
            List<Integer> t = new ArrayList<>(nums.length);
            for(int i = 0; i < nums.length; i ++){
                t.add(nums[i]);
            }
            r.add(t);
        }while(nextPermutation(nums));
        return r;
    }
}

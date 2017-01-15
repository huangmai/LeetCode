package huangmai.leetCode.problems.hashProblem;

import java.util.HashMap;
import java.util.Map;

public class P0219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k <= 0){
            return false;
        }
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0, l; i < nums.length; i ++){
            l = m.getOrDefault(nums[i], -k - 1);
            if(i - l <= k){
                return true;
            }
            m.put(nums[i], i);
        }
        return false;
    }
}

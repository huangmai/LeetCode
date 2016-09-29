package huangmai.leetCode.problems.arrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0015 {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        int n = nums.length;
        if(n < 3){
            return r;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> m = new HashMap<>();    //<number, last position>
        int i, j, s2, k;
        for(i = n - 1; i >= 0 && nums[i] >= 0; i --){
            if(!m.containsKey(nums[i])){
                m.put(nums[i], i);
            }
        }
        for(i = 0; i < n && nums[i] <= 0; i ++){
            if(i == 0 || nums[i] != nums[i - 1]){
                for(j = i + 1; j < n; j ++){
                    if(j == i + 1 || nums[j] != nums[j - 1]){
                        s2 = -nums[i] - nums[j];
                        if(s2 < 0 || s2 < nums[j]){
                            break;
                        }
                        k = m.getOrDefault(s2, -1);
                        if(k > j){
                            r.add(Arrays.asList(nums[i], nums[j], s2));
                        }
                    }
                }
            }
        }
        return r;
    }
}

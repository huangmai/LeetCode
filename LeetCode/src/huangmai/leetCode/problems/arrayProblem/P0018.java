package huangmai.leetCode.problems.arrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0018 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> r = new ArrayList<>();
        int n = nums.length;
        if(n < 4){
            return r;
        }
        Arrays.sort(nums);
        Map<Integer, List<Integer>> m = new HashMap<>();    //<sum of 2, <index11, index12, index21, index22, index31, index32, ...>>
        List<Integer> a, b, e;
        int i, j;
        for(i = 0; i < n; i ++){
            for(j = i + 1; j < n; j ++){
                a = new ArrayList<>(Arrays.asList(i, j));
                b = m.putIfAbsent(nums[i] + nums[j], a);
                if(b != null){
                    b.addAll(a);
                }
            }
        }
        e = new ArrayList<>();
        int i1, i2, i3, i4, s12;
        for(Map.Entry<Integer, List<Integer>> entry : m.entrySet()){
        	s12 = entry.getKey();
            a = entry.getValue();
            if((s12 << 1) < target){
            	continue;
            }
            b = m.getOrDefault(target - s12, e);
            for(i = 0; i < b.size(); i += 2){
            	i1 = b.get(i);
            	i2 = b.get(i + 1);
            	if(i == 0 || nums[i1] != nums[b.get(i - 2)]){            		
            		for(j = a.size() - 2; j >= 0; j -= 2){
                    	i3 = a.get(j);                    	
                    	if(i3 <= i2){
                    		break;
                    	}
                    	i4 = a.get(j + 1);
                        if(j == a.size() - 2 || nums[i3] != nums[a.get(j + 2)]){
                            r.add(Arrays.asList(nums[i1], nums[i2], nums[i3], nums[i4]));
                        }
                    }	
            	}                
            }
        }
        return r;
    }
}

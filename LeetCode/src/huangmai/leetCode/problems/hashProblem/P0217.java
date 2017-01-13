package huangmai.leetCode.problems.hashProblem;

import java.util.HashSet;
import java.util.Set;

public class P0217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>(nums.length);
        for(int n : nums){
            if(s.contains(n)){
                return true;
            }
            s.add(n);
        }
        return false;
    }
}

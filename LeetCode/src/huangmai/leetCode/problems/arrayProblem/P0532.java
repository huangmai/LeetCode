package huangmai.leetCode.problems.arrayProblem;

import java.util.Arrays;

public class P0532 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        if(k < 0){
            return 0;
        }
        int c = 0;
        for(int i = 0, j = 1; j < nums.length; ){
            switch(Integer.compare(nums[j] - nums[i], k)){
            case 0:
                ++ c;
                while(i < nums.length - 1 && nums[++ i] == nums[i - 1]);
                j = i + 1;
                break;
            case 1:
                if(++ i >= j){
                	++ j;
                }
                break;
            case -1:
                j ++;
                break;
            }
        }
        return c;
    }
}

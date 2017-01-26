package huangmai.leetCode.problems.arrayProblem;

public class P0330 {
    public int minPatches(int[] nums, int n) {
        int r = 0, c = 0, i = 0;
        while(c < n){
            if(i < nums.length && c >= nums[i] - 1){
            	if(c > Integer.MAX_VALUE - nums[i]){
            		break;
            	}
                c += nums[i ++];
            }
            else{
                r ++;
                if(c > 1073741823){
                	break;
                }
                c += c + 1;
            }
        }
        return r;
    }
}

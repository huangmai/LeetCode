package huangmai.leetCode.problems.bitProblem;

public class P0136 {
    public int singleNumber(int[] nums) {
        int t = 0;
        for(int n : nums){
            t ^= n;
        }
        return t;
    }
}

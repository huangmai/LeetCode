package huangmai.leetCode.problems.bitProblem;

public class P260 {
    public int[] singleNumber(int[] nums) {
        int m = 0;
        for(int n : nums){
            m ^= n;
        }
        m &= -m;
        int[] r = new int[2];
        for(int n : nums){
            r[(n & m) == 0 ? 0 : 1] ^= n;
        }
        return r;
    }
}

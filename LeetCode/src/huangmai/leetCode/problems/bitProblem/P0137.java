package huangmai.leetCode.problems.bitProblem;

public class P0137 {
    public int singleNumber(int[] nums) {
        int[] b = new int[32];
        for(int n : nums){
            for(int i = 0, m = 1; i < 32; i ++, m <<= 1){
                b[i] += (n & m) != 0 ? 1 : 0;
            }
        }
        int r = 0;
        for(int i = 0, m = 1; i < 32; i ++, m <<= 1){
            if(b[i] % 3 != 0){
                r |= m;
            }
        }
        return r;
    }
}

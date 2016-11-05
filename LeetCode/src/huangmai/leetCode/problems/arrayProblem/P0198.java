package huangmai.leetCode.problems.arrayProblem;

public class P0198 {
    public int rob(int[] nums) {
        int a = 0, b = 0, c;
        for(int n : nums){
            c = a;
            a = Integer.max(a, n + b);
            b = c;
        }
        return a;
    }
}

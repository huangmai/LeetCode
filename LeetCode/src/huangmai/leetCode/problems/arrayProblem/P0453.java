package huangmai.leetCode.problems.arrayProblem;

public class P0453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            min = Integer.min(n, min);
        }
        int r = 0;
        for(int n : nums){
            r += n - min;
        }
        return r;
    }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0070 {
    public int climbStairs(int n) {
        int a = 1, b = 0, c;
        for(int i = 0; i < n; i ++){
            c = a;
            a = a + b;
            b = c;
        }
        return a;
    }
}

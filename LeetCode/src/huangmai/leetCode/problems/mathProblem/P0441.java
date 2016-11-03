package huangmai.leetCode.problems.mathProblem;

public class P0441 {
	public int arrangeCoins(int n) {
        return (int)((Math.sqrt(8.0 * n + 1.0) - 1.0) / 2.0);
    }
}

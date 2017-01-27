package huangmai.leetCode.problems.arrayProblem;

public class P0122 {
    public int maxProfit(int[] prices) {
        int p = 0;
        for(int i = 1; i < prices.length; i ++){
            p += Integer.max(0, prices[i] - prices[i - 1]);
        }
        return p;
    }
}

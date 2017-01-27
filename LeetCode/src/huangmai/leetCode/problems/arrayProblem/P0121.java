package huangmai.leetCode.problems.arrayProblem;

public class P0121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int p : prices){
            min = Integer.min(min, p);
            max = Integer.max(max, p - min);
        }
        return max;
    }
}

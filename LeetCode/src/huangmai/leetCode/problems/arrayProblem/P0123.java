package huangmai.leetCode.problems.arrayProblem;

public class P0123 {
	public int maxProfit(int[] prices) {
    	int l = prices.length;
        if(l < 2){
            return 0;
        }
        int[] p = new int[l];
        p[l - 1] = 0;
        int t = prices[l - 1];
        for(int i = l - 2; i >= 0; i --){
            t = Integer.max(t, prices[i]);
            p[i] = Integer.max(p[i + 1], t - prices[i]);
        }
        t = Integer.MAX_VALUE;
        int m = 0;
        for(int i = 0; i < l; i ++){
            t = Integer.min(t, prices[i]);
            p[i] += prices[i] - t;
            m = Integer.max(m, p[i]);
        }
        return m;
    }
}

package huangmai.leetCode.problems.dpProblem;

public class P0264 {
    public int nthUglyNumber(int n) {
        int[] fs = new int[]{2, 3, 5};
        int[] r = new int[n];
        int[] p = new int[fs.length];
        r[0] = 1;
        for(int i = 1, m; i < n; i ++){
            m = Integer.MAX_VALUE;
            for(int j = 0; j < fs.length; j ++){
                m = Integer.min(m, r[p[j]] * fs[j]);
            }
            for(int j = 0; j < fs.length; j ++){
                if(r[p[j]] * fs[j] == m){
                    p[j] ++;
                }
            }
            r[i] = m;
        }
        return r[n - 1];
    }
}

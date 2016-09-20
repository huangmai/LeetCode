package huangmai.leetCode.problems.arrayProblem;

public class P0011 {
	public int maxArea(int[] height) {
        int n = height.length;
        if(n < 2){
            return 0;
        }
        int m = 0;
        for(int l = -1, r = n, lh = 0, rh = 0; l < r; ){
            if(lh <= rh){
                lh = Integer.max(lh, height[++ l]);
            }else{
                rh = Integer.max(rh, height[-- r]);
            }
            m = Integer.max(m, Integer.min(lh, rh) * (r - l));
        }
        return m;
    }
}

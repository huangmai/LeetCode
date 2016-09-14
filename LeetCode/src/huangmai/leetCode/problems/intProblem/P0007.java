package huangmai.leetCode.problems.intProblem;

public class P0007 {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        boolean n = x < 0;
        if(n){
            x = -x;
        }
        int r = 0;
        while(x != 0){
            if(r > Integer.MAX_VALUE / 10){
                return 0;
            }
            r = r * 10 + x % 10;
            x /= 10;
        }
        return n ? -r : r;
    }
}

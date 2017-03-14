package huangmai.leetCode.problems.stringProblem;

import java.util.List;

public class P0539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] m = new boolean[1440];
        int n;
        for(String t : timePoints){
            n = (t.charAt(0) - '0') * 600 + (t.charAt(1) - '0') * 60 + (t.charAt(3) - '0') * 10 + (t.charAt(4) - '0');
            if(m[n]){
                return 0;
            }
            m[n] = true;
        }
        int min = Integer.MAX_VALUE, f = -1, l = -1440;
        for(n = 0; n < 1440; n ++){
            if(m[n]){
                min = Integer.min(min, n - l);
                l = n;
                f = f < 0 ? l : f;
            }
        }
        return Integer.min(min, 1440 + f - l);
    }
}

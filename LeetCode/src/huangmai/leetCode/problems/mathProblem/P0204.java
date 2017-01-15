package huangmai.leetCode.problems.mathProblem;

import java.util.Arrays;

public class P0204 {
    public int countPrimes(int n) {
        if(n <= 1){
            return 0;
        }
        boolean[] f = new boolean[n];
        Arrays.fill(f, true);
        for(int i = 2; i * i < n; i ++){
            if(f[i]){
                for(int j = i * i; j < n; f[j] = false, j += i);
            }
        }
        int s = 0;
        for(int i = 2; i < n; i ++){
            s += f[i] ? 1 : 0;
        }
        return s;
    }
}

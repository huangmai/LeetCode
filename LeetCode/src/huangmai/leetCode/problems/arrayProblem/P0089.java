package huangmai.leetCode.problems.arrayProblem;

import java.util.ArrayList;
import java.util.List;

public class P0089 {
    public List<Integer> grayCode(int n) {
        List<Integer> r = new ArrayList<>(1 << n);
        r.add(0);
        if(n >= 32 || n <= 0){
            return r;
        }
        r.add(1);
        for(int i = 2; i < (1 << n); i <<= 1){
            for(int j = r.size() - 1; j >= 0; j --){
                r.add(r.get(j) | i);
            }
        }
        return r;
    }
}

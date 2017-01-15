package huangmai.leetCode.problems.mathProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>(numRows);
        if(numRows <= 0){
            return r;
        }
        r.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i ++){
            List<Integer> c = new ArrayList<>(i + 1);
            List<Integer> u = r.get(i - 1);
            c.add(1);
            for(int j = 1; j < i; j ++){
                c.add(u.get(j - 1) + u.get(j));
            }
            c.add(1);
            r.add(c);
        }
        return r;
    }
}

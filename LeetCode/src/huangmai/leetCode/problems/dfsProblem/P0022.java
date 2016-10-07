package huangmai.leetCode.problems.dfsProblem;

import java.util.ArrayList;
import java.util.List;

public class P0022 {
    private List<String> result;
    private StringBuilder sb;
    private int n2;
    private void generate(int l, int r){
        if(l == 0 && r == 0){
            result.add(sb.toString());
            return;
        }
        if(l > 0){
            sb.setCharAt(n2 - l - r, '(');
            generate(l - 1, r);
        }
        if(r > 0 && r > l){
            sb.setCharAt(n2 - l - r, ')');
            generate(l, r - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        if(n > 0){
            n2 = n << 1;
            sb = new StringBuilder(n2);
            sb.setLength(n2);
            generate(n, n);
        }
        return result;
    }
}

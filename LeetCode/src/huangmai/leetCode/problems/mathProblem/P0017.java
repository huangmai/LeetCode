package huangmai.leetCode.problems.mathProblem;

import java.util.ArrayList;
import java.util.List;

public class P0017 {
    private StringBuilder sb;
    private List<String> r;
    private String digits;
    private boolean addCombinations(int n){
        if(n >= digits.length()){
            r.add(sb.toString());
            return true;
        }
        int l = digits.charAt(n) - '2';
        if(l < 0 || l > 7){
            return false;
        }
        for(int i = 0; i < (l == 5 || l == 7 ? 4 : 3); i ++){
            sb.setCharAt(n, (char)('a' + l * 3 + i + (l > 5 ? 1 : 0)));
            if(!addCombinations(n + 1)){
                return false;
            }
        }
        return true;
    }
    public List<String> letterCombinations(String digits) {
        r = new ArrayList<>();
        if(digits.isEmpty()){
            return r;
        }
        this.digits = digits;
        sb = new StringBuilder(digits);        
        addCombinations(0);
        return r;
    }
}

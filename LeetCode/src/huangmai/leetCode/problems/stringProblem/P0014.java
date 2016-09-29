package huangmai.leetCode.problems.stringProblem;

public class P0014 {
    public String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        if(l == 0){
            return "";
        }else if(l == 1){
            return strs[0];
        }
        char t;
        for(int i = 0; i < strs[0].length(); i ++){
            t = strs[0].charAt(i);
            for(int j = 1; j < l; j ++){
                if(i >= strs[j].length() || strs[j].charAt(i) != t){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}

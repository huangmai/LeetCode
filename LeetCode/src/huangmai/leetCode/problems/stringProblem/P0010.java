package huangmai.leetCode.problems.stringProblem;

public class P0010 {
	public boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            return s.isEmpty();
        }
        if(p.length() == 1 || p.charAt(1) != '*'){
            return s.length() >= 1 && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0)) ? 
                isMatch(s.substring(1), p.substring(1)) : false;
        }
        for(int i = -1; i < s.length() && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i)); i ++){
            if(isMatch(s.substring(i + 1), p.substring(2))){
                return true;
            }
        }
        return false;
    }
}

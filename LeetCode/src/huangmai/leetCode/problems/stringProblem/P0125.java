package huangmai.leetCode.problems.stringProblem;

public class P0125 {
	private int getChar(char c){
        if(c >= 'a' && c <= 'z'){
            return c - 'a' + 1;
        }
        if(c >= 'A' && c <= 'Z'){
            return c - 'A' + 1;
        }
        if(c >= '0' && c <= '9'){
            return '0' - c - 1;
        }
        return 0;
    }
    public boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1, a, b; i < j; ){
            if(getChar(s.charAt(i)) == 0){
                i ++;
                continue;
            }
            if(getChar(s.charAt(j)) == 0){
                j --;
                continue;
            }
            if(getChar(s.charAt(i)) != getChar(s.charAt(j))){
                return false;
            }else{
                i ++;
                j --;
            }
        }
        return true;
    }
}

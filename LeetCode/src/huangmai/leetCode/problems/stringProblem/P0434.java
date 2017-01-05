package huangmai.leetCode.problems.stringProblem;

public class P0434 {
    public int countSegments(String s) {
        int sc = 0;
        boolean f = false;
        for(char c : s.toCharArray()){
            if(c == ' '){
                sc += f ? 1 : 0;
                f = false;
            }else{
                f = true;
            }
        }
        if(f){
            sc ++;
        }
        return sc;
    }
}

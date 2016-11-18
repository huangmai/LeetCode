package huangmai.leetCode.problems.stringProblem;

public class P0459 {
    public boolean repeatedSubstringPattern(String str) {
        int sl = str.length();
        String t;
        for(int l = 1, k; l <= (sl >> 1); l ++){
            if(sl % l == 0){
                t = str.substring(0, l);
                for(k = l; k < sl && t.equals(str.substring(k, k + l)); k += l);
                if(k >= sl){
                    return true;
                }
            }
        }
        return false;
    }
}

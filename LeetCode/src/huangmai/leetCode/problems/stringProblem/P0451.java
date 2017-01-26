package huangmai.leetCode.problems.stringProblem;

import java.util.Arrays;
import java.util.Comparator;

public class P0451 {
	private static class CharCount{
        public char c;
        public int n;
        public CharCount(char c){
            this.c = c;
            n = 1;
        }
    }
    public String frequencySort(String s) {
        CharCount[] f = new CharCount[256];
        Arrays.fill(f, null);
        for(char c : s.toCharArray()){
            if(f[c] == null){
                f[c] = new CharCount(c);
            }else{
                f[c].n ++;
            }
        }
        Arrays.sort(f, new Comparator<CharCount>(){
            @Override
            public int compare(CharCount c1, CharCount c2){
                if(c1 == null){
                    return c2 == null ? 0 : 1;
                }
                if(c2 == null){
                    return -1;
                }
                return Integer.compare(c2.n, c1.n);
            }
        });
        StringBuilder r = new StringBuilder(s.length());
        for(CharCount c : f){
            if(c == null){
                break;
            }
            for(int i = 0; i < c.n; i ++){
                r.append(c.c);
            }
        }
        return r.toString();
    }
}

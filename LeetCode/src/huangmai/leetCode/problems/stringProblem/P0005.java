package huangmai.leetCode.problems.stringProblem;

public class P0005 {
	public String longestPalindrome(String s) {
        int sl = s.length();
        if(sl == 0){
            return "";
        }
        int[] lp = new int[sl << 1];
        int m = 0, mi = 0;
        for(int i = 0, c = 0; i < (sl << 1); i ++){
        	lp[i] = i < c + lp[c] ? Integer.min(c + lp[c] - i, lp[(c << 1) - i]) : (i & 1);
            while(i + lp[i] + 1 < (sl << 1) && i - lp[i] - 1 >= 0 && s.charAt(i + lp[i] + 1 >> 1) == s.charAt(i - lp[i] - 1 >> 1)){
                lp[i] += 2;
            }
            if(i + lp[i] > c + lp[c]){
                c = i;
            }
            if(lp[i] > m){
                m = lp[i];
                mi = i - lp[i] >> 1;
            }
        }
        return s.substring(mi, mi + m);
    }
}

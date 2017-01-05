package huangmai.leetCode.problems.stringProblem;

import java.util.Arrays;

public class P0423 {
	public String originalDigits(String s) {
        int[] cc = new int[26];
        Arrays.fill(cc, 0);
        for(char c : s.toCharArray()){
            cc[c - 'a'] ++;
        }
        int[] n = new int[10];
        n[0] = cc['z' - 'a'];
        n[2] = cc['w' - 'a'];
        n[4] = cc['u' - 'a'];
        n[6] = cc['x' - 'a'];
        n[8] = cc['g' - 'a'];
        n[1] = cc['o' - 'a'] - n[0] - n[2] - n[4];
        n[3] = cc['t' - 'a'] - n[2] - n[8];
        n[5] = cc['f' - 'a'] - n[4];
        n[7] = cc['s' - 'a'] - n[6];
        n[9] = cc['i' - 'a'] - n[5] - n[6] - n[8];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 9; i ++){
            char[] na = new char[n[i]];
            Arrays.fill(na, (char)('0' + i));
            sb.append(na);
        }
        return sb.toString();
    }
}

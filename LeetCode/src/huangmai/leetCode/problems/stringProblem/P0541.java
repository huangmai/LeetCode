package huangmai.leetCode.problems.stringProblem;

public class P0541 {
    public String reverseStr(String s, int k) {
        int sl = s.length();
        StringBuilder sb = new StringBuilder(sl);
        for(int p = 0, t; p < s.length(); p += (k << 1)){
            t = Integer.min(p + k, sl);
            sb.append(new StringBuilder(s.substring(p, t)).reverse());
            sb.append(s.substring(t, Integer.min(t + k, sl)));
        }
        return sb.toString();
    }
}

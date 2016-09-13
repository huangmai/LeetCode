package huangmai.leetCode.problems.stringProblem;

public class P0006 {
	public String convert(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }
        int sl = s.length();
        if(sl <= numRows){
            return s;
        }
        int rl = numRows - 1 << 1, rc = sl / rl + (sl % rl == 0 ? 0 : 1), t;
        StringBuilder sb = new StringBuilder(sl);
        for(int i = 0; i < numRows; i ++){
            for(int r = 0; r < rc; r ++){
                if(i + r * rl < sl){
                    sb.append(s.charAt(i + r * rl));
                }
                t = (numRows - 1 << 1) - i + r * rl;
                if(i != 0 && i != numRows - 1 && t < sl){
                    sb.append(s.charAt(t));
                }
            }
        }
        return sb.toString();
    }
}

package huangmai.leetCode.problems.intProblem;

public class P0012 {
    public String intToRoman(int num) {
        String[][] r = new String[][]{
            {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"M", "MM", "MMM"}
        };
        StringBuilder sb = new StringBuilder();
        for(int i = 3, p = 1000, t; i >= 0; i --){
            t = num / p;
            if(t > 0){
                sb.append(r[i][t - 1]);
            }
            num -= t * p;
            p /= 10;
        }
        return sb.toString();
    }
}

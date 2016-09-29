package huangmai.leetCode.problems.intProblem;

public class P0013 {
	private int tryUnderstand(StringBuilder p){
        switch(p.toString()){
        case "A":
            return 1;
        case "AA":
            return 2;
        case "AAA":
            return 3;
        case "AB":
            return 4;
        case "B":
            return 5;
        case "BA":
            return 6;
        case "BAA":
            return 7;
        case "BAAA":
            return 8;
        case "AC":
            return 9;
        default:
            return 0;
        }
    }
    public int romanToInt(String s) {
        char[][] r = new char[][]{
            {'0'},
            {'M', '0'},
            {'C', 'D'},
            {'X', 'L'},
            {'I', 'V'}
        };
        int n = 0, i = 0, k = 1, p = 1000;
        char t;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()){
            t = s.charAt(i ++);
            if(t == r[k][0]){
                sb.append('A');
            }else if(t == r[k][1]){
                sb.append('B');
            }else if(t == r[k - 1][0]){
                sb.append('C');
            }else{
                n += tryUnderstand(sb) * p;
                sb = new StringBuilder();
                p /= 10;
                k ++;
                i --;
            }
        }
        n += tryUnderstand(sb) * p;
        return n;
    }
}

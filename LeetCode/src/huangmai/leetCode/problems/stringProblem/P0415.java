package huangmai.leetCode.problems.stringProblem;

public class P0415 {
    public String addStrings(String num1, String num2) {
        boolean c = false;
        StringBuilder r = new StringBuilder();
        for(int i = num1.length() - 1, j = num2.length() - 1, t; i >= 0 || j >= 0 || c; i --, j--){
            t = (c ? 1 : 0) + (i < 0 ? 0 : num1.charAt(i) - '0') + (j < 0 ? 0 : num2.charAt(j) - '0');
            c = t > 9;
            r.append((char)(t % 10 + '0')); 
        }
        return r.reverse().toString();
    }
}

package huangmai.leetCode.problems.mathProblem;

import java.util.Arrays;

public class P0043 {
    public String multiply(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();
        if(l1 > l2){
            return multiply(num2, num1);
        }
        if(num1.equals("0")){
            return "0";
        }
        int[] r = new int[l1 + l2];
        Arrays.fill(r, 0);
        for(int i = l1 - 1, c; i >= 0; i --){
            c = 0;
            for(int j = l2 - 1; j >= 0; j --){
                r[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + c;
                c = r[i + j + 1] / 10;
                r[i + j + 1] %= 10;
            }
            r[i] += c;
        }
        StringBuilder sb = new StringBuilder(l1 + l2);
        for(int i : r){
            sb.append((char)('0' + i));
        }
        return r[0] == 0 ? sb.substring(1) : sb.toString();
    }
}

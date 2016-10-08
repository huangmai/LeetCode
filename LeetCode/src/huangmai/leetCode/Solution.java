package huangmai.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {    
	private List<String> result;
    private StringBuilder sb;
    private int n2;
    private void generate(int l, int r){
        if(l == 0 && r == 0){
            result.add(sb.toString());
            return;
        }
        if(l > 0){
            sb.setCharAt(n2 - l - r, '(');
            generate(l - 1, r);
        }
        if(r > 0 && r < l){
            sb.setCharAt(n2 - l - r, ')');
            generate(l, r - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        if(n > 0){
            n2 = n << 1;
            sb = new StringBuilder(n2);
            sb.setLength(n2);
            generate(n, n);
        }
        return result;
    }
	
	public static void main(String[] args){
		Solution s = new Solution();
		int i = 0;
		int a = i, b = a + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(s.generateParenthesis(3));
	}
}

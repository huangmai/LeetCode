package huangmai.leetCode.problems.intProblem;

public class P0008 {
	public int myAtoi(String str) {
        str = str.trim();
        if(str.isEmpty()){
            return 0;
        }
        boolean b = str.charAt(0) == '-';
        char c;
        int r = 0, k;
        for(int i = b || str.charAt(0) == '+' ? 1 : 0; i < str.length(); i ++){
            c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                k = c - '0';
                if(b){
                    if(r >= Integer.MIN_VALUE / 10){
                        r *= 10;
                        if(r >= Integer.MIN_VALUE + k){
                            r -= k;
                            continue;
                        }
                    }
                    return Integer.MIN_VALUE;
                }else{
                    if(r <= Integer.MAX_VALUE / 10){
                        r *= 10;
                        if(r <= Integer.MAX_VALUE - k){
                            r += k;
                            continue;
                        }
                    }
                    return Integer.MAX_VALUE;
                }
            }else{
                break;
            }
        }
        return r;
    }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0402 {
    public String removeKdigits(String num, int k) {
        int l = num.length();
        if(l == k){
            return "0";
        }
        if(k == 0){
            return num;
        }
        char[] r = new char[l - k];
        int t = -1;
        for(int i = 0; i < l; i ++){
            while(t >= 0 && r[t] > num.charAt(i) && i <= k + t){
                t --;
            }
            if(t < l - k - 1){
                r[++ t] = num.charAt(i);
            }
        }
        int s = 0;
        while(s < l - k && r[s] == '0'){
            s ++;
        }
        if(s == l - k){
            return "0";
        }
        return new String(r).substring(s);
    }
}

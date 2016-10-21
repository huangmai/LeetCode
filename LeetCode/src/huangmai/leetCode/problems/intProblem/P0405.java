package huangmai.leetCode.problems.intProblem;

public class P0405 {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        long n = num < 0 ? 4294967296L + num : num;
        int t;
        StringBuilder r = new StringBuilder(); 
        while(n > 0){
            t = (int)(n % 16);
            r.append(t > 9 ? (char)('a' + (t - 10)) : (char)('0' + t));
            n /= 16;
        }
        r.reverse();
        return r.toString();
    }
}

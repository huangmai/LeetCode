package huangmai.leetCode.problems.intProblem;

public class P0504 {
    public String convertToBase7(int num) {
        switch(num){
        case 0:
            return "0";
        case Integer.MIN_VALUE:
            return "-104134211162";
        default:
            {
                boolean f = num < 0;
                if(f){
                    num = -num;
                }
                StringBuilder sb = new StringBuilder();
                while(num != 0){
                    sb.append((char)('0' + (num % 7)));
                    num /= 7;
                }
                if(f){
                    sb.append('-');
                }
                return sb.reverse().toString();
            }
        }
    }
}

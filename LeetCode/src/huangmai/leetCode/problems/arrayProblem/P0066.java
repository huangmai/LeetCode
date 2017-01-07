package huangmai.leetCode.problems.arrayProblem;

public class P0066 {
    public int[] plusOne(int[] digits) {
        boolean c = true;
        for(int i = digits.length - 1; i >= 0; i --){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] ++;
                break;
            }
        }
        if(digits[0] == 0){
            int[] r = new int[digits.length + 1];
            r[0] = 1;
            return r;
        }else{
            return digits;
        }
    }
}

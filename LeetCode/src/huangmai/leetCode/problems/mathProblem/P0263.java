package huangmai.leetCode.problems.mathProblem;

public class P0263 {
    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        int[] fs = new int[]{2, 3, 5};
        for(int f : fs){
            while(num % f == 0){
                num /= f;
            }
        }
        return num == 1;
    }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0213 {
    public int rob(int[] nums) {
        int a, b, c, t;
        if(nums.length == 1){
            return nums[0];
        }
        a = b = c = 0;
        for(int i = 0; i < nums.length - 1; i ++){
            t = b;
            b = a;
            a = Integer.max(t + nums[i], a);
        }
        b = 0;
        for(int i = 1; i < nums.length; i ++){
            t = b;
            b = c;
            c = Integer.max(t + nums[i], c);
        }
        return Integer.max(a, c);
    }
}

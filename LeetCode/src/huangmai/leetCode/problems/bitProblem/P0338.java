package huangmai.leetCode.problems.bitProblem;

public class P0338 {
    public int[] countBits(int num) {
        int[] r = new int[num + 1];
        r[0] = 0;
        for(int i = 0; i <= num; i ++){
            r[i] = r[i >> 1] + (i & 1);
        }
        return r;
    }
}

package huangmai.leetCode.problems.arrayProblem;

public class P0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = gas.length, s = 0, si;
        int[] d = new int[l];
        for(int i = 0; i < l; i ++){
            d[i] = gas[i] - cost[i];
            s += d[i];
        }
        if(s < 0){
            return -1;
        }
        s = si = 0;
        for(int i = 0; i < l; i ++){
            s += d[i];
            if(s < 0){
                s = 0;
                si = i + 1;
            }
        }
        return si;
    }
}

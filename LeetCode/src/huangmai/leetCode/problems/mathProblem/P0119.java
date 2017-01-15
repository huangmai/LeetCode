package huangmai.leetCode.problems.mathProblem;

public class P0119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>(rowIndex + 1);
        if(rowIndex < 0){
            return r;
        }
        int i;
        r.add(1);
        for(i = 1; i <= rowIndex; i ++){
            r.add((int)((double)r.get(i - 1) * (rowIndex + 1 - i) / i));
        }
        return r;
    }
}

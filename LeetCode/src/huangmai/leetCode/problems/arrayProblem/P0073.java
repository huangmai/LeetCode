package huangmai.leetCode.problems.arrayProblem;

public class P0073 {
	public void setZeroes(int[][] matrix) {
        int m, n;
        m = matrix.length;
        if(m == 0){
            return;
        }
        n = matrix[0].length;
        if(n == 0){
            return;
        }
        int i, j;
        boolean fr = false, fc = false;
        for(i = 0; i < m; i ++){
            if(matrix[i][0] == 0){
                fc = true;
                break;
            }
        }
        for(j = 0; j < n; j ++){
            if(matrix[0][j] == 0){
                fr = true;
                break;
            }
        }
        for(i = 1; i < m; i ++){
            for(j = 1; j < n; j ++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(i = 1; i < m; i ++){
            if(matrix[i][0] == 0){
                for(j = 0; j < n; j ++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(j = 0; j < n; j ++){
            if(matrix[0][j] == 0){
                for(i = 0; i < m; i ++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(fr){
            for(j = 0; j < n; j ++){
                matrix[0][j] = 0;
            }
        }
        if(fc){
            for(i = 0; i < m; i ++){
                matrix[i][0] = 0;
            }
        }
    }
}

package huangmai.leetCode.problems.stringProblem;

public class P0028 {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length(), nl = needle.length();
        if(hl < nl || nl == 0){
            return -1;
        }
        int[] f = new int[nl];
        f[0] = -1;
        int i, j;
        for(i = 1; i < nl; i ++){
            for(j = i - 1; f[j] >= 0 && needle.charAt(i - 1) != needle.charAt(f[j]); j = f[j]);
            f[i] = f[j] + 1;
        }
        for(i = 0, j = 0; j < nl && hl - i >= nl - j; ){
            if(haystack.charAt(i) == needle.charAt(j)){
                i ++;
                j ++;
            }else{
                if(j > 0){
                    j = f[j];
                }else{
                    i ++;
                    j = 0;
                }
            }
        }
        return j == nl ? i - nl : -1;
    }
}

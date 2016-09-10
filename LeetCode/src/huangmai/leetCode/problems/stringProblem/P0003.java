package huangmai.leetCode.problems.stringProblem;

import java.util.Arrays;

public class P0003 {
    public int lengthOfLongestSubstring(String s) {
        int startPosition = 0, maxLength = 0;
        int[] lastPosition = new int[26];
        Arrays.fill(lastPosition, -1);
        for(int i = 0, k; i < s.length(); i ++){
            k = s.charAt(i) - 'a';
            if(lastPosition[k] >= startPosition){
                startPosition = lastPosition[k] + 1;
                if(s.length() - startPosition <= maxLength){
                    break;
                }
            }else{
                maxLength = Integer.max(maxLength, i - startPosition);
                lastPosition[k] = i;
            }
        }
        return maxLength;
    }
}

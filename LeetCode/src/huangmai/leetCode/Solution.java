package huangmai.leetCode;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startPosition = 0, maxLength = 0;
        int[] lastPosition = new int[256];
        Arrays.fill(lastPosition, -1);
        for(int i = 0, k; i < s.length(); i ++){
            k = s.charAt(i);
            if(lastPosition[k] >= startPosition){
                startPosition = lastPosition[k] + 1;
                if(s.length() - startPosition <= maxLength){
                    break;
                }
            }else{
                maxLength = Integer.max(maxLength, i - startPosition + 1);                
            }
            lastPosition[k] = i;
        }
        return maxLength;
    }
    
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
	}
}

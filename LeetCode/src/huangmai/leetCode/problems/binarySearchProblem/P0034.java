package huangmai.leetCode.problems.binarySearchProblem;

public class P0034 {
	public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m, s = -1, e = -1;
        while(l <= r){
            m = (l + r >> 1);
            if(nums[m] == target){
                s = e = m;
                while(l <= s){
                    m = (l + s >> 1);
                    if(nums[m] < target){
                        l = m + 1;
                    }else{
                        if(m == 0 || nums[m - 1] < target){
                            s = m;
                            break;
                        }else{
                            s = m - 1;
                        }
                    }
                }
                while(e <= r){
                    m = (e + r >> 1);
                    if(nums[m] > target){
                        r = m - 1;
                    }else{
                        if(m == nums.length - 1 || nums[m + 1] > target){
                            e = m;
                            break;
                        }else{
                            e = m + 1;
                        }
                    }
                }
                break;
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return new int[]{s, e};
    }
}

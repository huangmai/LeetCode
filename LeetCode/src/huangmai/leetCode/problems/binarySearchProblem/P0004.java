package huangmai.leetCode.problems.binarySearchProblem;

public class P0004 {
	private int findKth(int[] nums1, int[] nums2, int n1, int n2, int k){
        int l1 = nums1.length - n1, l2 = nums2.length - n2;
        if(l1 > l2){
            return findKth(nums2, nums1, n2, n1, k);
        }
        if(l1 == 0){
            return nums2[n2 + k];
        }
        if(k == 0){
            return Integer.min(nums1[n1], nums2[n2]);
        }
        int s1 = Integer.min(k - 1 >> 1, l1 - 1), s2 = k - s1 - 1;
        switch(Integer.signum(Integer.compare(nums1[n1 + s1], nums2[n2 + s2]))){
        case 0:
            return nums1[n1 + s1];
        case 1:
            return findKth(nums1, nums2, n1, n2 + s2 + 1, k - s2 - 1);
        case -1:
            return findKth(nums1, nums2, n1 + s1 + 1, n2, k - s1 - 1);
        default:
            return 0;
        }
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        return (l & 1) == 0 ? (double)(findKth(nums1, nums2, 0, 0, l >> 1) + findKth(nums1, nums2, 0, 0, l - 1 >> 1)) / 2.0: findKth(nums1, nums2, 0, 0, l >> 1);
    }
}

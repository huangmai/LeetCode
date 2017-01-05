package huangmai.leetCode.problems.arrayProblem;

public class P0268 {
	/*
	 * There are 4 ways to solve this problem:
	 * 1. using sum: 
	 * 	sum nums up to s and the missing one will be n * (n + 1) / 2 - s.
	 * 	problem with this is s and n * (n + 1) / 2 can be large and we need biginteger which maynot satisfied with constant memory.
	 * 2. using ^:
	 * 	This is the implementation we using here.
	 * 	a = 0 ^ 1 ^ ... ^ n, b = ^ nums
	 * 	then b ^ m = a. so b ^ b ^ m = b ^ a so m = b ^ a.
	 *  it's also easy and definitly constant memory.
	 *  comparing to 1 it's a little bit slow cause we need to calculate a, but still linear and not that slow consider bit operation is fast and no biginteger involved.
	 *  it's important to manage this skill cause it shows a strong cs mind during interview
	 * 3. sorting and scan:
	 * 	O(nlogn)
	 * 4. special sorting:
	 * 	cause this is a 0 ... n array, for each number we just need to put it into correct position and have an extra number keeps the original number in that position.
	 * 	each inner loop will end until the number = position.
	 * 	it's still O(n) though it has 2 loop layer.
	 * 	however the code will not as clean as 2.
	 * */
    public int missingNumber(int[] nums) {
        int m = 0, n = nums.length;
        for(int i = 0; i <= n; i ++){
            m ^= i;
        }
        for(int i = 0; i < n; i ++){
            m ^= nums[i];
        }
        return m;
    }
}

package huangmai.leetCode.problems.bitProblem;

import java.util.HashSet;
import java.util.Set;

public class P0421 {
	/*
	 * The general idea of this algorithm is as expected:
	 * Since we need to do it O(n), we must will do it bit by bit.
	 * It's also very easy to noticed that we should start from the MSB(most significant bit).
	 * 
	 * A natural but difficult way is express a pruning mechanism:
	 * for example (in binary): 110, 100, 11
	 * for the MSB it should be 100 constructed as (110, 11) or (100, 11).
	 * so we can put 110, 100 into same category and 11 into another.
	 * When construct next bit we should only pick pairs in different category.
	 * Now we may have some numbers pruned: 110 in this case.
	 * And then we do next bit we should re-categorize again.
	 * However, this prune may not be valid. ie if test cases is 110, 100, 10, 1. We should keep them all alive on 2nd bit but with different category. 
	 * So a trie is required, and the code will be super complex.
	 * 
	 * Instead, in this implementation, we do it a simple way:
	 * Obvious if we try out all pair(O(n^2)) we will always get the biggest xor.
	 * We can also do this bit by bit. On each bit, we separate the prefix (left part we care) out. and try out all pair of left part, we can get the biggest xor until this bit.
	 * This looks like dumb (O(32*n^2)) cause the last bit actually gives the final result. However, if we can decrease all pair on one bit to linear this will make it fast (O(32*n)).
	 * For each bit if max represent the biggest xor until previous bit, what we actully do is deciding corresponding bit in max should be 1 or 0.
	 * Let's guess it can be 1 and let new max to be tmp, then what we do now is to look for a pair of prefixes p1 and p2 makes p1 ^ p2 = tmp.
	 * If such pair exist then max = tmp, otherwise keeps this bit in max to be 0.     
	 * We know: let tmp = p1 ^ p2 then tmp ^ p1 = p1 ^ p2 ^ p1 = p2.
	 * So the pair we are looking for can also means for each p1 to see if p2 exists.
	 * Now it's obvious, a set can be used to make this look up procedure fast.
	 * */
	public int findMaximumXOR(int[] nums) {		
        int max = 0;	//result until current bit
        int mask = 0;	//mask is used to separate prefix.
        for(int i = 31; i >= 0; i--){	//do it bit by bit from MSB
        	//separate prefix and put it into a set.
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            
            int tmp = max | (1 << i);	//tmp is when this bit of max been set to 1.
            for(int prefix : set){	//try to find prefix p1 so p2 = p1 ^ tmp existed in set
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;	//if found set bit of max to 1.
                    break;
                }
            }
        }
        return max;
    }
}

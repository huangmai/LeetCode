package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0061 {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode ne = head, oe = head;
        for(int i = 0; i < k; i ++){
            if(oe.next == null){
                k %= i + 1;
                i = -1;
                oe = head;
            }else{
                oe = oe.next;    
            }
        }
        while(oe.next != null){
            oe = oe.next;
            ne = ne.next;
        }
        oe.next = head;
        oe = ne.next;
        ne.next = null;
        return oe;
    }
}

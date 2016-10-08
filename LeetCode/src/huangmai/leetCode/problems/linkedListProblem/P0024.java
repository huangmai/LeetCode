package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        for(ListNode a = d, b = head; b != null && b.next != null; a = b, b = a.next){
            a.next = b.next;
            b.next = b.next.next;
            a.next.next = b;
        }
        return d.next;
    }
}

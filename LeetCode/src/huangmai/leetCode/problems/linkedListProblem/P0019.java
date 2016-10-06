package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(0), f = d, t = d;
        d.next = head;
        for(int i = 0; i < n; i ++){
            f = f.next;
        }
        while(f.next != null){
            f = f.next;
            t = t.next;
        }
        t.next = t.next.next;
        return d.next;
    }
}

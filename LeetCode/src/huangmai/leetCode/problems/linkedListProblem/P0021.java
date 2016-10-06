package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0), h = d;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                d.next = l1;
                l1 = l1.next;
            }else{
                d.next = l2;
                l2 = l2.next;
            }
            d = d.next;
        }
        d.next = l1 == null ? l2 : l1;
        return h.next;
    }
}

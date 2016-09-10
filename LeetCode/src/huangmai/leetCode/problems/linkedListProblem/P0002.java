package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        ListNode result = new ListNode(0), l3 = result;
        int t;
        while(l1 != null || l2 != null || carry){
            t = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (carry ? 1 : 0);
            carry = t >= 10;
            l3.next = new ListNode(t % 10);
            l3 = l3.next;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }
        return result.next;
    }
}

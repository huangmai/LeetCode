package huangmai.leetCode.problems.linkedListProblem;

import huangmai.leetCode.libClass.ListNode;

public class P0025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        } 
        ListNode d = new ListNode(0), h = d, p = d, q = head, m;
        d.next = head;
        int c = 1;
        while(q != null && q.next != null){
            m = q.next;
            q.next = m.next;
            m.next = p.next;
            p.next = m;
            c ++;
            if(c == k){
                p = q;
                q = q.next;
                c = 1;
            }
        }
        if(c != 1){
            q = p.next;
            while(q.next != null){
                m = q.next;
                q.next = m.next;
                m.next = p.next;
                p.next = m;
            }
        }
        return h.next;
    }
}

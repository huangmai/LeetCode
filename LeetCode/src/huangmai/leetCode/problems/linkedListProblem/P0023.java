package huangmai.leetCode.problems.linkedListProblem;

import java.util.Comparator;
import java.util.PriorityQueue;

import huangmai.leetCode.libClass.ListNode;

public class P0023 {
	public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(n, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                return Integer.compare(l1.val, l2.val);
            }
        });
        for(int i = 0; i < n; i ++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }
        ListNode d = new ListNode(0), h = d;
        while(pq.size() > 1){
            d.next = pq.poll();
            d = d.next;
            if(d.next != null){
                pq.offer(d.next);
            }
        }
        if(!pq.isEmpty()){
            d.next = pq.poll();
        }
        return h.next;
    }
}

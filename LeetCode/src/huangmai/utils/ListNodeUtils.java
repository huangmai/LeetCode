package huangmai.utils;

import huangmai.leetCode.libClass.ListNode;

public class ListNodeUtils {
	public static ListNode listFromInts(int ... vals){
		ListNode dummy = new ListNode(0), c = dummy;
		for(int val : vals)	{
			c.next = new ListNode(val);
			c = c.next;
		}
		return dummy.next;
	}
	
	public static String printList(ListNode listHead) {
		if(listHead == null){
			return "null";
		}
		ListNode t = listHead;
		StringBuilder sb = new StringBuilder();
		while(t.next != null && t.next != listHead){
			sb.append("" + t.val + ", ");
		}
		if(t.next == listHead){
			sb.append("LOOP");
		}else{
			sb.append("" + t.val);	
		}		
		return sb.toString();
	}
}

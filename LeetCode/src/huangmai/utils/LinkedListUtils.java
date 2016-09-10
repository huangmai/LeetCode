package huangmai.utils;

import huangmai.leetCode.libClass.ListNode;

public class LinkedListUtils {
	public static ListNode getLinkedList(int... nodeValues){
		if(nodeValues.length == 0){
			return null;
		}
		ListNode result = new ListNode(0), t = result;
		for(int value : nodeValues){
			t.next = new ListNode(value);
			t = t.next;
		}
		return result.next;
	}
}

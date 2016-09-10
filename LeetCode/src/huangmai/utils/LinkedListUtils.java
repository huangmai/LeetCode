package huangmai.utils;

import huangmai.leetCode.libClass.ListNode;

public class LinkedListUtils {
	public static ListNode getLinkedList(int... nodeValues){
		ListNode result = new ListNode(0);
		if(nodeValues.length != 0){
			ListNode t = result;
			for(int value : nodeValues){
				t.next = new ListNode(value);
				t = t.next;
			}
		}
		return result.next;
	}
}

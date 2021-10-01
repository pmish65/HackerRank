class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		int carry = 0;
		ListNode curr = null;
		ListNode head = null;
		while (curr1 != null && curr2 != null) {
			int value = curr1.val + curr2.val + carry;
			ListNode node = new ListNode();
			if (value >= 10) {
				node.val = value - 10;
				carry = 1;
			} else {
				node.val = value;
				carry = 0;
			}
			if (curr == null) {
				head = node;
				curr = node;
			} else {
				curr.next = node;
				curr = node;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		if (curr1 != null) {
			while (curr1 != null) {
				int value = carry + curr1.val;
				ListNode node = new ListNode();
				if (value >= 10) {
					node.val = value - 10;
					carry = 1;
				} else {
					node.val = value;
					carry = 0;
				}
				curr.next = node;
				curr = node;
				curr1 = curr1.next;
			}
		} else {
			while (curr2 != null) {
				int value = carry + curr2.val;
				ListNode node = new ListNode();
				if (value >= 10) {
					node.val = value - 10;
					carry = 1;
				} else {
					node.val = value;
					carry = 0;
				}
				curr.next = node;
				curr = node;
				curr2 = curr2.next;
			}
		}
		if (carry != 0) {
			ListNode node = new ListNode(1);
			curr.next = node;
		}
		return head;
	}
}

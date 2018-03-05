

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * 相当于每次在前面插入元素
 * Created by QQQ on 2018/2/13.
 */
public class _15_ReverseList {
	public ListNode ReverseList(ListNode head) {
		if (head==null){
			return head;
		}
		ListNode result = new ListNode(head.val);
		ListNode pre = null;
//		ListNode temp = null;
		while (head.next!=null){
			head = head.next;
			pre = new ListNode(head.val);
			pre.next = result;
			result = pre;

		}
		return result;

	}


}

import java.util.List;

/**
 * 题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * Created by QQQ on 2018/2/14.
 */
public class _16_MergeList {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if (list1 == null){
			return list2;
		}
		if (list2 == null){
			return list1;
		}
		ListNode result = null;
		ListNode current = null;
		while (list1!=null&&list2!=null){


				if (list1.val<=list2.val){
					if (result==null) {
						result = current = list1;
//					current = nextNode;
//						current = result.next;
					}else{
						current.next = list1;
						current = current.next;

					}
					list1 = list1.next;
				}else {
//					nextNode = new ListNode(list2.val);
					if (result==null) {
						result = current = list2;
//					current = nextNode;
//						current = result.next;
					}else{
						current.next = list2;
						current = current.next;
					}
					list2 = list2.next;
				}
		}

		if (list1 == null){
//			nextNode = list2;
			current.next = list2;
		}else{
//			nextNode = list1;
			current.next = list1;
		}
		return result;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		b = new ListNode(3);
		System.out.println(a.next.val);
//		ListNode test1  = new ListNode(1);
//		test1.next = new ListNode(3);
//		test1.next.next = new ListNode(5);
//
//		ListNode test2  = new ListNode(2);
//		test2.next = new ListNode(4);
//		test2.next.next = new ListNode(6);
//
//		_16_MergeList test = new _16_MergeList();
//		test.Merge(test1,test2);
	}
}

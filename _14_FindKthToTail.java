/**
 * Created by QQQ on 2018/2/13.
 */
public class _14_FindKthToTail {
	public ListNode FindKthToTail(ListNode head,int k) {
		if (head == null){
			return null;
		}
		ListNode end = head;
		ListNode kToend = head;
		for (int i=0;i<k;i++){
			if(i==k-1&&end==null){
				return null;
			}
			end = end.next;
		}
		while(end!=null){
			end = end.next;
			kToend = kToend.next;
		}
		return kToend;
	}
}

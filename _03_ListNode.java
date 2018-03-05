import java.util.ArrayList;


/**
 * Created by QQQ on 2018/2/6.
 */
public class _03_ListNode {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();

		while(listNode!=null){
			list.add(0,listNode.val);
			listNode = listNode.next;
		}



		return list;
	}


}

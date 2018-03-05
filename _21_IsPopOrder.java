import java.util.ArrayList;

/**
 * -- 典型题。栈的错误输出判断
 * 题目：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * Created by QQQ on 2018/2/18.
 */
public class _21_IsPopOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if (pushA.length == 0||pushA == null){
			return false;
		}
		ArrayList<Integer> stack = new ArrayList<>();
		boolean result = true;
		int top = 0;
		int topA = 0;
		stack.add(top,pushA[topA]);
		for (int i = 0;i<popA.length;i++){

			while (stack.get(top) != popA[i]){
				if (topA == pushA.length-1 ){
					return false;
				}

				stack.add(++top,pushA[++topA]);
			}

			top --;



		}
		return result;
	}

	public static void main(String[] args) {
		int i = 0;
		ArrayList<Integer> test = new ArrayList<>();
		test.add(++i,i);
		System.out.println(test.get(1));
	}
}

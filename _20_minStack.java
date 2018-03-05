import java.util.Iterator;
import java.util.Stack;
/**
 * 题目：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * 多引入了Iterator,不引入的实现：使用两个栈，其中一个栈用来保存最小值（比当前top小或相等的压栈）
 * Created by QQQ on 2018/2/16.
 */
public class _20_minStack {
//	int min = Integer.MAX_VALUE;
	Stack stack = new Stack();
	public void push(int node) {
		stack.push(node);

	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return  (int)stack.peek();
	}

	public int min() {
		int min = (int)stack.peek();
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()){
			int temp = iterator.next();
			if (temp < min){
				min = temp;
			}
		}

		return min;
	}
}

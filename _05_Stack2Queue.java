import java.util.Stack;

/**
 * Created by QQQ on 2018/2/9.
 */
public class _05_Stack2Queue {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);


	}

	public int pop() {

		while(!stack1.empty()){
			int temp = stack1.pop();
			stack2.push(temp);
		}

		int result = stack2.pop();
		while(!stack2.empty()){
			int temp = stack2.pop();
			stack1.push(temp);
		}

		return  result;
	}
}

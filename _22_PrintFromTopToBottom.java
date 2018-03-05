import java.util.ArrayList;

/**
 * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * Created by QQQ on 2018/2/18.
 */
public class _22_PrintFromTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayList<TreeNode> node = new ArrayList<>();
		if (root == null){
			return null;
		}

		node.add(root);
		for (int i = 0;i<node.size();i++){
			result.add(node.get(i).val);
			if (node.get(i).left!=null){
				node.add(node.get(i).left);
			}

			if (node.get(i).right!=null){
				node.add(node.get(i).right);
			}

		}



		return result;
	}



	public void test(ArrayList<Integer> i){
		i.set(0,3);
	}

	public static void main(String[] args) {
		_22_PrintFromTopToBottom test = new _22_PrintFromTopToBottom();
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		test.test(i);
		System.out.println(i.get(0));
	}
}

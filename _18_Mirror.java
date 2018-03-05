/**
 * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
 * Created by QQQ on 2018/2/16.
 */
public class _18_Mirror {
	public void Mirror(TreeNode root) {
		if (root == null){
			return;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		if (left!=null){
			root.right = left;

			Mirror(root.right);
		}else {
			root.right = null;
		}
		if (right!=null){
			root.left = right;
			Mirror(root.left);
		}else {
			root.left = null;
		}





	}
}

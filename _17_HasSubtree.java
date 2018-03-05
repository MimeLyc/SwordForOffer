/**
 * 好题。较难
 * 题目：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * Created by QQQ on 2018/2/14.
 */
public class _17_HasSubtree {

	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if (root2 ==null){
			return false;
		}

		if (root1 == null &&root2!=null){
			return false;
		}

		if (root1.val == root2.val){
			result = isSubtree(root1,root2);

		}

		if(result == false){
			result = HasSubtree(root1.left,root2);
			if (result == false){
				result = HasSubtree(root1.right,root2);
			}
		}


		return result;

	}

	private boolean isSubtree(TreeNode root1,TreeNode root2){
		boolean result = false;
		if (root2 == null){
			return true;
		}

		if (root1 == null&&root2!=null){
			return false;
		}
		if (root1.val!=root2.val){
			return false;
		}
		boolean isleft = isSubtree(root1.left,root2.left);
		boolean isright = isSubtree(root1.right,root2.right);

		result = isleft&&isright;


		return result;

	}
}

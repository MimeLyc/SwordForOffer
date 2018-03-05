/**
 * 根据中序遍历和先序遍历建立二叉树
 * 解题过程中搞混了先序遍历和中序遍历
 */
public class _04_reConstructBinaryTree {

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//		System.out.println(in[0]);
//		System.out.println(pre.length+":"+in.length);

//
		if(in.length==0||pre.length==0){
			return null;
		}
		TreeNode node = new TreeNode(pre[0]);
//		构建左子
//		找出根在中序遍历中的下标
		int indexL = this.getIndex(in,pre[0]);
		int[] newIn = this.getSubarray(0,indexL,in);
		int[] newPre = this.getSubarray(1,1+newIn.length,pre);
		node.left = this.reConstructBinaryTree(newPre,newIn);

//构建右子树
//找出右子树的先序遍历
		int indexR = newPre.length+1;
//		System.out.println(indexR);
		int[] newRIn = this.getSubarray(indexL + 1, in.length, in);
		int[] newRPre = this.getSubarray(indexR, pre.length, pre);
//		System.out.println(newRPre.length+":"+newRIn.length);
		node.right = this.reConstructBinaryTree(newRPre, newRIn);
		return node;

	}

	private int getIndex(int[] array,int x){

		int index = 0;
		for (int i=0;i<array.length;i++){
			if(x == array[i]){
				index = i;
				break;
			}
		}

		return index;
	}

	private int[] getSubarray(int from,int to,int[] array){
		int[] result = new int[to-from];
//		System.out.println(from+":"+to);
		for (int i=0;i<to-from;i++){

			result[i] = array[i+from];
//			System.out.print(result[i]);
		}

//		System.out.println();

		return result;

	}

	public static void main(String[] args) {
		_04_reConstructBinaryTree test = new _04_reConstructBinaryTree();
		int[] pre = {1,2,4,3,5,6};
		int[] in ={4,2,1,5,3,6};
		test.reConstructBinaryTree(pre,in);
	}

}

/**
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * Created by QQQ on 2018/2/18.
 */
public class _23_VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int [] sequence) {

		if (sequence.length==0||sequence == null){
			return false;
		}
		boolean result = true;


		result = this.isBST(0,sequence.length,sequence);

		return result;

	}

	private boolean isBST(int start,int end,int[] array){
//		int num = end-start;
		if (array.length==0||end-start <=1){
			return true;
		}
//		System.out.println(start+":"+end);
		int root = array[end-1];
		boolean result = true;
		int margin=end-2;
//		System.out.println();
		for (int i = start;i<end-1;i++){
			if (array[i] > root){
				margin = i-1;
				break;
			}
		}
//		System.out.println(margin);
		int rightNum = end -1 - margin-1;
		for (int i = end-1-rightNum;i<end-1;i++){
			if (array[i] <root){
//				System.out.println(array[i]+":"+root);
				return false;
			}
		}

		boolean left = isBST(start,end-1 - rightNum,array);
		boolean right = isBST(end-1-rightNum,end-1,array);

		result = left&&right;
		return result;

	}

	public static void main(String[] args) {
		_23_VerifySquenceOfBST test = new _23_VerifySquenceOfBST();
		int[] array = {1,2,3,4,5};
		System.out.println(test.VerifySquenceOfBST(array));


	}

}

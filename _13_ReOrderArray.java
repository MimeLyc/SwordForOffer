/**
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 新思路：也可以用冒泡排序
 * Created by QQQ on 2018/2/13.
 */
public class _13_ReOrderArray {
	public void reOrderArray(int [] array) {
		int[] result = new int[array.length];
		for (int i=0,j=0,k=array.length-1;j<=k;i++){
			if (array[i]%2 == 1){
				result[j] = array[i];
				j++;
			}
			if (array[array.length-i-1]%2 == 0){
				result[k] = array[array.length-i-1];
				k--;

			}
		}
		for (int i=0;i<array.length;i++){
			array[i] = result[i];
		}
	}

	public static void main(String[] args) {
		_13_ReOrderArray test = new _13_ReOrderArray();
		int[] temp = {1,2,3,4,5,6,7};
		test.reOrderArray(temp);
	}

}

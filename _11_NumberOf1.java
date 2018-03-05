/**
 * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * Created by QQQ on 2018/2/13.
 */
public class _11_NumberOf1 {
	public int NumberOf1(int n) {
		int result = 0;
		for (int i=0;i<32;i++){
			result += (n&1);
			n >>=1;
		}
		return result;

	}

	public static void main(String[] args) {
		_11_NumberOf1 test = new _11_NumberOf1();
		int res = test.NumberOf1(-1);
		System.out.println(res);
	}
}

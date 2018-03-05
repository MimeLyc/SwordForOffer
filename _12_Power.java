/**
 * 题目：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * Created by QQQ on 2018/2/13.
 */
public class _12_Power {
	public double Power(double base, int exponent) {
		double result = 1;
		if (exponent>=0) {
			for (int i = 0; i < exponent; i++) {
				result *= base;
			}
		}else{
			for (int i = 0; i < -exponent; i++) {
				result /= base;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		_12_Power test = new _12_Power();
		double res = test.Power(2,-3);
		System.out.println(res);
	}
}

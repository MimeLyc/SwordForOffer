/**
 * Created by QQQ on 2018/2/9.
 */
public class _07_Fibonacci {

	public int Fibonacci(int n) {
		if(n==1||n==2){
			return 1;
		}
		int result = 0;
		int first  = 1;
		int second = 1;
		for (int i=3;i<=n;i++){
			result = first+second;
			first = second;
			second = result;
		}

		return result;
	}
}

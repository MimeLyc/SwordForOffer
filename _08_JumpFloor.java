/**
 * 实际可以转化为斐波那契数列
 * Created by QQQ on 2018/2/12.
 */
public class _08_JumpFloor {

	public int JumpFloor(int target) {
		if(target == 0){
			return 1;
		}
		if (target == 1){
			return 1;
		}
		int result = 0;

		result += (JumpFloor(target-1));
		result += (JumpFloor(target-2));
		return result;
	}
}

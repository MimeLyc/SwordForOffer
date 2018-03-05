/**
 * 若用08题的思路会产生栈溢出的问题
 * Created by QQQ on 2018/2/12.
 */
public class _09_JumpFloor2 {
	public int JumpFloorII(int target) {
		if(target == 0){
			return 1;
		}
		if (target == 1){
			return 1;
		}
		if (target == 2){
			return 2;
		}
//		int result = 0;
		int[] temp = new int[target+1];

		temp[0] = 1;
		temp[1] = 1;
/**
 * 	target-1到target只有一种跳法
 * 	target-2到target不与（target-1到target）重复的话只有一种跳法
 * 	依次类推，到target的跳法为所有小于target的台阶跳法之和
 */

		for (int i = 2;i<=target;i++){
			temp[i] = 0;
			for (int j=0;j<i;j++){
				temp[i] += temp[j];
			}
		}
		return temp[target];
	}
}

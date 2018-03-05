/**
 * Created by QQQ on 2018/2/9.
 */
public class _06_FindMinInArray {
	public int minNumberInRotateArray(int [] array) {
		if (array.length == 0){
			return 0;
		}
		if (array.length ==1 ){
			return array[0];
		}

		int result = 0;
		for (int i=0;i<array.length;i++){


			if(i==array.length-2){
				result  = array[array.length-1];
				break;
			} else {

				if(array[i]>array[i+1]){
					result = array[i+1];
					break;
				}
			}

		}
		return result;



	}

	public static void main(String[] args) {
		_06_FindMinInArray test = new _06_FindMinInArray();
		int[] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
		test.minNumberInRotateArray(array);
	}
}

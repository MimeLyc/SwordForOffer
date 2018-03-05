/**
 * Created by QQQ on 2018/1/28.
 */

/**
 * 改进点：从左上开始搜索会导致循环次数较多，应从左下开始搜索
 */
public class _01_FindingInArray {
	public boolean Find(int target, int [][] array) {
//		System.out.println(array.length);
		if (array.length ==0||array[0].length ==0){
			return false;
		}

		boolean isContain = false;
		int row = array.length;
		int column = array[0].length;

		if (target<array[0][0]||target>array[row-1][column-1]){
			return false;
		}

		for (int i=0;i<row;i++){
			if(target<array[i][0]){
				isContain = false;
				break;
			}

			for (int j = 0;j<column;j++){
				if (target == array[i][j]) {
					isContain = true;
					break;
				}
//				else if (j<=column-1&&target>array[i][j]&&target<array[i][j+1]){
//					System.out.println("??");
//					isContain = false;
//					break;
//				}
			}
			if(isContain == true){
				break;
			}


		}

		return isContain;
	}

	public static void main(String[] args) {
		_01_FindingInArray test = new _01_FindingInArray();
		int[][] array = new int[][]{
				{},{},{},{}
		};

		System.out.println(test.Find(1,array));
	}
}

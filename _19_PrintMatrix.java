import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * Created by QQQ on 2018/2/16.
 */
public class _19_PrintMatrix {


	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		if (matrix.length == 0){
			return null;
		}

		int row = matrix.length;
		int col = matrix[0].length;
		int lmargin = -1;
		int tmargin = 0;
		int num = row*col;
		int x = -1;
		int y = 0;
		for (int i = 0 ;i<num;){
//			System.out.println(i);
			if (x == lmargin&&y == tmargin){
				lmargin = lmargin+1;
				for (int m = lmargin;m<col;m ++ ){
					result.add(matrix[y][m]);
					i++;
				}
				x = col-1;
				y = tmargin;

			}else if (x == col-1&&y == tmargin){
				tmargin = tmargin+1;
				for (int m = tmargin;m<row;m ++ ){
					result.add(matrix[m][x]);
					i++;
				}
				x = col-1;
				y = row-1;
			}else if (x == col-1&&y == row-1){
				col = col-1;
				for (int m = col-1;m>lmargin-1;m -- ){
					result.add(matrix[y][m]);
					i++;
				}
				x = lmargin;
				y = row-1;



			}else if (x == lmargin&&y == row-1){
				row = row-1;
				for (int m = row-1;m>tmargin-1;m -- ){
					result.add(matrix[m][x]);
					i++;
				}
				x = lmargin;
				y = tmargin;
			}
		}

		return result;



	}

	public static void main(String[] args) {
		_19_PrintMatrix test = new _19_PrintMatrix();
		int[][] temp = {{1,2},{3,4}};
		ArrayList<Integer> result = test.printMatrix(temp);
		for (int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}


	}
}
package hairetsu;
public class ArrayKadai {
	public static void main(String[] args) {

	int[][] test = {
					{60, 3, 22},
					{30, 55, 60},
					{40, 41},
					{80, 1, 7, 56}
				   };
//	配列の中のすべての要素を1つずつ出力する処理
	
		for(int i = 0; i < test.length; i++){
			for(int j = 0; j < test[i].length; j++){
				System.out.println(test[i][j]);
			}
		}
	}
}

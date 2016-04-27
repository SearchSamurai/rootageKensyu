package if_for_logic_kadai;
//ロジック課題 1からxまでの足し算.
//
//public class InputSum2 {
//
//    // お題
//    // キーボードから1つの整数を入力し、
//    // 1から、入力した整数(x)までの合計を求める処理.
//
//    // 実行結果は下記の通り
//    // いくつまでの合計を求めますか?
//    // 10 ← キーボードから1つの整数を入力する
//    // 1から10までの合計は55です。
//}

public class InputSum2{
	@SuppressWarnings("resource")
	public static void main(String[] args){

		System.out.println("1からいくつまでの合計を求めますか？ 1より大きい整数を1つ入力してください。");
		int x = new java.util.Scanner(System.in).nextInt();

		int total = 0;

		total = (x*(x+1))/2;

		System.out.println("1から" + x + "までの合計は" + total + "です。");
	}
}
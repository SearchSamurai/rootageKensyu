package if_for_logic_kadai;
///**
// * ロジック課題.
// */
//public class LogicKadai {
//
//    /**
//     * メイン処理.
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        // ロジック課題その1
//        // 当クラスに偶数を判定するメソッドを定義する。
//        // メソッド名: judgeEven
//        // 引数: 判定対象の整数
//        // 戻り値: 判定結果(真偽値)
//        // 定義したメソッドを呼び出し、戻り値を受け取る。
//        // 受け取った戻り値を画面に出力する。
//    }
//}

public class LogicKadai{
	public static boolean judgeEven(int x){

		boolean result = false;
		if(x % 2 == 0){
			result = true;
		}
		return result;
	}

	public static void main(String[] args){
		System.out.println("入力された整数が偶数ならtrueを、奇数ならfalseを出力します。整数を1つ入力して下さい。");
		int x = new java.util.Scanner(System.in).nextInt();
		boolean result = judgeEven(x);

		if(result == true){
			System.out.println("判定結果は" + result + "なので、" + x + "は偶数です。");
		} else {
			System.out.println("判定結果は" + result + "なので、" + x + "は奇数です。");
		}
	}
}
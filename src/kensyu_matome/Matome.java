package kensyu_matome;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Matome {

	//指定されたバイト数ごとに区切って渡すメソッド
	public List<String> byteSeparate(int devideByte , String str){

		//指定されたバイト数ごとに区切られた文字列を格納していくリスト
		List<String> strSeparate = new ArrayList<String>();

		//一時的に文字列を格納するための変数
		String tmp = null;

		//バイト数カウント用変数
		int countByte = 0;

		//引数で受け取った文字列の長さ。for文用に長さを取得して格納
		int strLength = str.length();

		//指定されたバイト数ごとに文字列を区切っていくループ処理
		for(int i = 0; i < strLength; i++){
			try {
				//文字コードはMS932を指定。引数で渡された文字列の0~i番目の文字列から、getBytesで
				//バイト数を取得。しかしこのままではbyteの配列型なので、.lengthでint型の数値として長さを取得
				countByte = str.substring(0,i).getBytes("MS932").length;

				//区切りたい文字列のバイト数が、区切りたいバイト数以上の値になった場合・・・
				if(countByte >= devideByte){

					//さらに、区切りたい文字列のバイト数が、区切りたいバイト数と等値な場合・・・
					if(countByte == devideByte){

						//0~i番目の文字列までは条件に当てはまるので、tmpに格納
						tmp = str.substring(0,i);

					//そうでない(区切りたい文字列のバイト数が、区切りたいバイト数を超えていた)場合・・・
					} else {

						//0~i番目の文字列のバイト数は、区切りたいバイト数を超えているので、
						//末尾1文字を減らすために、0~i-1番目の文字列をtmpに格納
						tmp = str.substring(0,i-1);
					}

					//tmpをリストに追加
					strSeparate.add(tmp);

					//引数で渡された文字列から、リストに格納済みの文字列(tmp)を削除(空文字に置換)
					str = str.replace(tmp , "");

					//文字列の長さが変わったので、長さを再取得
					strLength = str.length();

					//次のループでまた先頭の文字列からバイト数を判定していくために、iに0を再代入する
					i=0;
				}

			//例外処理
			} catch (UnsupportedEncodingException e) {
				System.out.println("文字コード関連の例外が発生しました。処理を終了します。");
			}
		}

		//指定されたバイト数ごとに区切っていき、最後に残った文字列をリストに格納
		strSeparate.add(str);

		//メソッドの呼び出し元へ値(リスト)を返す
		return strSeparate;
	}
}

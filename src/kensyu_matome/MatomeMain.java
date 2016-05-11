package kensyu_matome;

import java.util.List;

public class MatomeMain {

	public static void main(String[] args) {

		//後にこの文字列を、指定されたバイト数ごとに区切っていく
		String str = "111111111111ああああああああ";

		//指定されたバイト数ごとに、文字列を区切る処理を行うクラスから、インスタンスを生成
		Matome m = new Matome();

		//第一引数はint型の3以上の値で渡す
		//指定されたバイト数ごとに区切られた文字列が格納されたリストを、戻り値として受け取る
		List<String> strSeparate = m.byteSeparate(4 , str);

		//指定されたバイト数ごとに区切られた文字列が格納されたリストの中身を順に表示

		int strSeparateSize = strSeparate.size();

		for(int i = 0; i < strSeparateSize; i++){
			System.out.println(strSeparate.get(i));
		}
	}
}

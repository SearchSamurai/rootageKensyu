package stringbuilder;
public class StringStudy {
	public static void main(String[] args) {
//      2通りのオブジェクト生成方法がある
//		 どちらでも記述できる
		String s1 = "あいう";
		String s2 = new String("あいう");

		System.out.println(s1);
		System.out.println(s2);

//		charAt
//		n番目の文字列を抜き出す。文字列の先頭は0文字目とみなす。
		String s3 = "かきくけこ";

		System.out.println(s3.charAt(2));
//		System.out.println(s3.charAt(5)); エラーになる

//		concat
//		文字列の結合。
		String s4 = "さしす";
		String s5 = "せそ";
//		String s6 = s4.concat(s5);
		String s7 = "さしす";
		String s8 = "";
		String s9 = s7.concat(s8);
		System.out.println(s4.concat(s5));
		System.out.println(s9);

//		endsWith
//		文字列が指定された部分文字列で終わるかどうかを判定する。
		String s10 = "なにぬねの";
		System.out.println("「なにぬねの」が「なにぬ」で終わっているかを判定します。");
		System.out.println(s10.endsWith("なにぬ"));
		System.out.println("「なにぬねの」が「ねの」で終わっているかを判定します。");
		System.out.println(s10.endsWith("ねの"));

//		equals
//		2つの文字列が等しいかどうかを確認する。
		String s11 = "はひふへほ";
		System.out.println("「はひふへほ」が「はひふへほ」と同じ文字列かを判定します。");
		System.out.println(s11.equals("はひふへほ"));
		System.out.println("「はひふへほ」が「こんにちは」と同じ文字列かを判定します。");
		System.out.println(s11.equals("こんにちは"));

//		indexOf
//		文字列に含まれる部分文字列を検索する。
		String s12 = "にわにはにわにわとりがいる";
		System.out.println(s12.indexOf("にわ"));  // 結果：0
		System.out.println(s12.indexOf("にわ", 1));   // 2文字めの「わ」以降から検索を開始するので、結果：4
		String s13 = "いぬがどこにもいぬ";
		System.out.println(s13.indexOf("が"));
		System.out.println(s13.indexOf("いぬ", 1));
		System.out.println(s13.indexOf("いぬ", 13));

//		length
//		文字列の長さを取得する。
		String s14 = "rootage株式会社";
		System.out.println(s14.length());
		System.out.println(s14.codePointCount(1, s14.length()));
		String s15 = "叱";
		System.out.println(s15.length());
		System.out.println(s15.codePointCount(0, s15.length()));

//		replace
//		単に指定した文字列に置き換える。
		String s16 = "おかざきゆうき";
		s16.replace('き','2');
		System.out.println(s16);
		System.out.println(s16.replace("き", "3")); //replaceは、マッチした文字をそのまま置き換えます。
		System.out.println(s16.replace("さ", "3"));

//		replaceAll
//		正規表現パターンにマッチした文字列を置き換える。
		String s17 = "おかざきゆうき";
		System.out.println(s17.replaceAll("き", "1")); //replaceAllは、マッチした文字を正規表現として置き換えます。

		String s_1 = "あいaかきaさ";
		String s_2 = s_1.replace("a","b");
		System.out.println(s_2); //あいbかきbさ
		String s_3 = s_1.replaceAll("[あa]" , "b"); //bいbかきbさ
		System.out.println(s_3);

//		split
//		指定の文字列を正規表現にマッチした箇所で分割して、配列に要素として格納する。
	    //(1)分割する文字列を生成
	    String s18 = "今日は,いい天気,ですね";
	    //(2)文字列をsplitメソッドで分割
	    String[] strAry = s18.split(",");
	    //(3)分割された文字列の表示
	    for (int i=0; i < strAry.length; i++) {
	      System.out.println(strAry[i]);
	    }
//		endsWith
//		文字列が指定された部分文字列で始まるかどうかを判定する。
		String s19 = "まみむめも";
		System.out.println("「まみむめも」が「まみむ」で始まっているかを判定します。");
		System.out.println(s19.startsWith("まみむ"));
		System.out.println("「まみむめも」が「めも」で始まっているかを判定します。");
		System.out.println(s19.startsWith("めも"));

//		substring
//		文字列を切り出す。指定された beginIndex から始まり、インデックス endIndex - 1 にある文字まで。
		String s20 = "ABCDE";
//		最初から３文字目までを取り出す
		System.out.println(s20.substring(0,3));
//		２文字目から３文字目までを取り出す
		System.out.println(s20.substring(1,3));
//		３文字目を取り出す
		System.out.println(s20.substring(2,3));
//		３文字目から最後までを取り出す
		System.out.println(s20.substring(2));

//		trim
//		文字列の先頭や終了部分の空白(半角スペース)、改行文字やタブ文字の除去（全角スペースは含まない）。
		String s21 = " 明日 映画を 見る ";
		System.out.println(s21.trim());
		System.out.println(s21);

		String s21_1 = " 明日 映画を 見る ";
		String s21_2 = s21_1.trim();
		System.out.println(s21_2);
		String s21_3 = "  Good Morning  ".trim();
		System.out.println(s21_3);

//		valueOf
//		引数に指定された値の文字列表現を返す。
		int x = 100;
		int y = 0x10;
		int y1 = 0177;
        int y2  = Integer.parseInt("00010001", 2);
		float z = 3.0F;

		System.out.println(String.valueOf(x));
		System.out.println(String.valueOf(y));
		System.out.println(String.valueOf(y1));
		System.out.println(String.valueOf(y2));
		System.out.println(String.valueOf(z));
	}
}

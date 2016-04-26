package stringbuilder;
public class StringBuilderStudy {
	public static void main(String[] args) {
//		StringBuilder と StringBuffer は、ほぼ同じクラス (同じコンストラクタ、メソッドを持つ)
		StringBuilder sb1 = new StringBuilder("あいう");
		StringBuffer sb2 = new StringBuffer("あいう");
		System.out.println(sb1);
		System.out.println(sb2);

//
//		append
//		文字列末尾に文字列を追加していく。オーバーロードされており、基本データ型は全てサポートされている。
//		StringBuilder append(boolean b)
//		StringBuilder append(char c)
//		StringBuilder append(char[] str)
//		StringBuilder append(char[] str, int offset, int len)
//		StringBuilder append(CharSequence s)
//		StringBuilder append(CharSequence s, int start, int end)
//		StringBuilder append(double d)
//		StringBuilder append(float f)
//		StringBuilder append(int i)
//		StringBuilder append(long lng)
//		StringBuilder append(Object obj)
//		StringBuilder append(StringBuffer sb)
		StringBuilder sb3 = new StringBuilder("かきく");
		StringBuilder sb4 = new StringBuilder("DE");

		sb3.append('A');
		StringBuilder sb3_1 = sb3.append('B');
		System.out.println(sb3_1);//かきくAB
		System.out.println("  char: "+sb3.append('C'));//  char: かきくABC
		System.out.println("String: "+sb3.append("けこ"));//String: かきくABCけこ
		System.out.println("Object: "+sb3.append(sb4));//Object: かきくABCけこDE

		StringBuilder sb3_2 = new StringBuilder();
		sb3_2.append("abc");
		sb3_2.append("def");
		sb3_2.append("ghi");

		String sb3_3 = new String(sb3_2);  // "abcdefghi"
		System.out.println(sb3_2);
		System.out.println(sb3_3);

		StringBuilder sb3_4 = new StringBuilder();
		boolean b1 = false;

		sb3_4.append("ABCDE");
		sb3_4.append(b1);

		System.out.println(sb3_4);

		StringBuilder sb3_5 = new StringBuilder();
		String nu = null;
		sb3_5.append("ABCDE");
		sb3_5.append(nu);
		System.out.println(sb3_5);

//		charAt(int)
//		文字列のindex番目の文字を返す。
		StringBuilder sb5 = new StringBuilder("さしすせそ");
		char c = sb5.charAt(0);
		char d = sb5.charAt(3);
//		String e = sb5.charAt(2); 型の不一致でエラー
		System.out.println(c);//さ
		System.out.println(d);//せ

		int x_1 = 1;
		char c_1 = sb5.charAt(x_1);
		System.out.println(c_1); //し

//		delte
//		指定した文字列の削除(指定インデックスから指定インデックス-1番目)
		StringBuffer sb6 = new StringBuffer("たちつてと"); //つてと
		System.out.println(sb6.delete(0,2));
		StringBuffer sb6_1 = new StringBuffer("たちつてと");//たちと
		System.out.println(sb6_1.delete(2,4));
		StringBuffer sb6_2 = new StringBuffer("たちつてと");//つてと
		StringBuffer sb6_3 = sb6_2.delete(0,2);
		System.out.println(sb6_3);

		StringBuffer sb6_4 = new StringBuffer("たちつてと");//つてと
		sb6_4.delete(0,2);
		System.out.println(sb6_4);

//		indexOf
//		一番最初に出現するインデックス番号を返す（存在しない場合は -1 が返る）
		//"ぬね"が一番最初に出現するインデックス番号を取得する
		StringBuffer sb7 = new StringBuffer("なにぬねの");
		System.out.println(sb7.indexOf("ぬね"));
//		見つからないので-1を返す。
		System.out.println(sb7.indexOf("AB"));
		//インデックス番号2（3文字目）以降で"ねの"が最初に出現するインデックス番号を取得する
		System.out.println(sb7.indexOf("ねの", 2));

		int a = sb7.indexOf("に", 1);
		System.out.println(a);
		int a_1 = sb7.indexOf("に"); //1
		System.out.println(a_1); //1

//		insert
//		指定したインデックス番号に文字列を挿入する(※引数はintやcharなどもOK。)
//		インデックス番号1（２文字目）に"***"を挿入する
		int x =5;
		char e = 'A';
		StringBuffer sb8 = new StringBuffer("はひふへほ");
		System.out.println(sb8.insert(1, "***"));//は***ひふへほ
		StringBuffer sb8_1 = new StringBuffer("はひふへほ");
		System.out.println(sb8_1.insert(4, x));//はひふへ5ほ
		StringBuffer sb8_2 = new StringBuffer("はひふへほ");
		System.out.println(sb8_2.insert(5, e));//はひふへほA
		System.out.println(sb8_2.insert(sb8_2.length(), 'B'));//はひふへほAB
//		System.out.println(sb8_2.insert(8, e)); java.lang.ArrayIndexOutOfBoundsException

		StringBuffer sb8_3 = new StringBuffer("はひふへほ");
		StringBuffer sb8_4 = sb8_3.insert(1, "***");
		System.out.println(sb8_4);//は***ひふへほ

		StringBuffer sb8_5 = new StringBuffer("はひふへほ");
		sb8_5.insert(1, "***");
		System.out.println(sb8_5);//は***ひふへほ

//		length
//		文字数を取得する
		StringBuilder sb9 = new StringBuilder("まみむめも");
		StringBuffer sb10 = new StringBuffer("やゆよ");
		System.out.println(sb9.length());//5
		System.out.println(sb10.length());//3

		int b = sb9.length();
		System.out.println(b);//5

		StringBuffer sb10_1 = new StringBuffer("やゆよ");
		sb10_1.length();
		System.out.println(sb10_1);//やゆよ

//		replace
//		インデックス番号2～4（３～４文字目）を"***"に置換する
		StringBuffer sb11 = new StringBuffer("らりるれろ");
		System.out.println(sb11.replace(2, 4, "***"));//らり***ろ

		StringBuffer sb11_1 = new StringBuffer("らりるれろ");
		System.out.println(sb11_1.replace(1, sb11_1.length(), "abcd"));//らabcd

//		reverse
//		文字列の並びを反転させる
		StringBuffer sb12 = new StringBuffer("わをん");
		System.out.println(sb12.reverse());//んをわ

		StringBuffer sb12_1 = new StringBuffer("わをん");
		sb12_1.reverse();
		System.out.println(sb12_1);//んをわ

//		substring
//		インデックス番号3（4文字目）以降の文字列を取得する
		StringBuilder sb13 = new StringBuilder("がぎぐげご");//げご
		System.out.println(sb13.substring(3));
//		インデックス番号0～3（1～3文字目）の文字列を取得する
		StringBuffer sb14 = new StringBuffer("ざじずぜぞ");//ざじず
		System.out.println(sb14.substring(0, 3));

//		インデックス番号0～配列数（1～終わり）の文字列を取得する
		StringBuffer sb14_1 = new StringBuffer("ざじずぜぞ");//ざじずぜぞ
		System.out.println(sb14.substring(0, sb14_1.length()));

//		toString String型に変換してから文字列が返される
		StringBuilder sb15 = new StringBuilder("だぢづでど");//だぢづでど
		System.out.println(sb15.toString());


//		StringBuilder課題
//		StringBuilderを使用して作成する。
//		実行結果
//		くり返し:1
//		くり返し:2
//		くり返し:3
//		~~~~~~
//		くり返し:9
//		くり返し:10

//		1パターン目
		for(int i = 0; i < 10; i++){
			StringBuilder sb_b = new StringBuilder("くり返し:" + (i+1));
			System.out.println(sb_b);
		}
		for (int i = 0; i < 10; i++){
            StringBuilder sb_c = new StringBuilder();
            sb_c.append("くり返し:");
            sb_c.append(i + 1);
            System.out.println(sb_c);
        }
		for (int i = 0; i < 10; i++){
			StringBuilder sb_d = new StringBuilder("くり返し:");
			sb_d.insert(sb_d.length(),i+1);
			System.out.println(sb_d);
		}
//		2パターン目
		StringBuilder sb_d = new StringBuilder("くり返し:");
		for (int i = 0; i < 100; i++){
			sb_d.insert(sb_d.length(),i+1);
			System.out.println(sb_d);
			sb_d.delete(5,sb_d.length());
		}

		StringBuilder sb_e = new StringBuilder("くり返し:");
		for (int i = 0; i < 100; i++){
			sb_e.insert(sb_e.length(),i+1);
			System.out.println(sb_e);
			sb_e.delete(5,sb_e.length());
		}

        StringBuilder sb_f = new StringBuilder("くり返し:");
		for (int i = 0; i < 100; i++){
            sb_f.append(i + 1);
            System.out.println(sb_f);
			sb_f.delete(5,sb_f.length());
		}

//		3パターン目
		StringBuilder sb_g = new StringBuilder("くり返し:");
		for (int i = 0; i < 100; i++){
            sb_g.append(i + 1);
            System.out.println(sb_g);
			sb_g.setLength(5); //lengthが5になるように切り詰めている。現時点ではdeleteより実行速度が早い。
		}
	}
}
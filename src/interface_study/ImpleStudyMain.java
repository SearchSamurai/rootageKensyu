package interface_study;
import java.math.BigDecimal;
public class ImpleStudyMain {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	    // 左辺と右辺が同じ型
	    ImpleStudy imple1 = new ImpleStudy();

	    // 左辺があいまいな型
	    Inter1 i1 = new ImpleStudy();
	    Inter2 i2 = new ImpleStudy();
	    Inter3 i3 = new ImpleStudy();
	    Inter4 i4 = new ImpleStudy();

	    // それぞれのオブジェクトを指す変数(imple1, i1, i2, i3, i4)で
	    // メソッドを呼ぶ(abc, def, ghi)
	    // ここに処理を記入してください

	    BigDecimal bd1 = new BigDecimal("1");
	    imple1.abc(5);
	    imple1.def();
	    imple1.ghi(bd1);

	    i1.abc(6);
//	    i1.def(); メソッド def() は型 Inter1 で未定義です
	    i1.ghi(null);

//	    i2.abc(7); メソッド abc(int) は型 Inter2 で未定義です
//	    i2.def(); メソッド def() は型 Inter2 で未定義です
	    i2.ghi(null);

//	    i3.abc(9); メソッド abc(int) は型 Inter3 で未定義です
//	    i3.def(); メソッド def() は型 Inter3 で未定義です
//	    i3.ghi(null); メソッド ghi(null) は型 Inter3 で未定義です

//	    i4.abc(10); メソッド abc(int) は型 Inter4 で未定義です
	    i4.def();
//	    i4.ghi(null); メソッド ghi(null) は型 Inter4 で未定義です

	    // それぞれのオブジェクトを指す変数で
	    // フィールドJKLにアクセスし、画面に出力する
	    // ここに処理を記入してください

	    System.out.println(imple1.JKL);
	    System.out.println(i1.JKL);
//	    System.out.println(i2.JKL); JKL は解決できないか、フィールドではありません
	    System.out.println(i3.JKL);
//	    System.out.println(i4.JKL); JKL は解決できないか、フィールドではありません
	}
}
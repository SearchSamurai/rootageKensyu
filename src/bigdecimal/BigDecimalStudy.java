package bigdecimal;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalStudy {
    public static void main(String[] args) {
		//BigDecimalはStringと同様、新しいオブジェクトを生み出す。
        //まずは計算処理を記述し、実行結果を考える
        System.out.println(1 - 0.1 * 9); // ここで何が出力されるか? //予想0.1
        //正解0.09999999999999998

        //before
        BigDecimal bd1_1 = BigDecimal.valueOf(1);
        BigDecimal bd1_2 = BigDecimal.valueOf(0.1);
        BigDecimal bd1_3 = BigDecimal.valueOf(9);
        //System.out.println("BigDecimalを使った結果");
        //System.out.println(BigDecimal.ONE.subtract(bd1_1.multiply(bd1_2)));

        //after
        System.out.println("BigDecimalのメソッドチェーンを使った結果");
        System.out.println((bd1_2.multiply(bd1_3).subtract(bd1_1)).abs());


        //abs オブジェクトに格納された数値の絶対値を求める
        BigDecimal bd2 = new BigDecimal(-5);
        System.out.println(bd2 + "の絶対値は");
        System.out.println(bd2.abs());

        //add 加算を行う
        BigDecimal bd3 = new BigDecimal(7);
        BigDecimal bd4 = new BigDecimal(3);
        BigDecimal bd4_1 = BigDecimal.valueOf(3);


        System.out.println(BigDecimal.ZERO.add(BigDecimal.ONE));

        System.out.println(bd3 +  "+" + bd4 + "は");
        System.out.println(bd3.add(bd4));

        //BigDecimal ans1 = bd3.add(bd4); //before
        //BigDecimal ans2 = ans1.add(bd4_1); //before
        //System.out.println(ans2); //before

        BigDecimal ans2 = bd3.add(bd4).add(bd4_1); //after
        System.out.println(bd3.add(bd4).add(bd4_1)); //after

        //divide 除算を行う
        //循環小数になる場合は java.lang.ArithmeticExceptionが出る。
        //ROUND_HALF_UPなどで丸める。
        BigDecimal bd5 = new BigDecimal(-5);
        BigDecimal bd6 = new BigDecimal(3);
        System.out.println(bd5 + "÷" + bd6 + "は");
        //System.out.println(bd5.divide(bd6)); 上記のエラー
        System.out.println(bd5.divide(bd6, 3, RoundingMode.HALF_UP));

        //multiply 乗算を行う
        BigDecimal bd7 = new BigDecimal(6);
        BigDecimal bd8 = new BigDecimal("4.0");
        System.out.println(bd7 + "×" + bd8 + "は");
        System.out.println(bd7.multiply(bd8));

        //setScale
        //ROUND_CEILING	正の無限大に近づくように丸めるモード
        //ROUND_DOWN	ゼロに近づくように丸めるモード
        //ROUND_FLOOR	負の無限大に近づくように丸めるモード
        //ROUND_HALF_DOWN	五捨六入する
        //ROUND_HALF_EVEN	末尾が偶数のほうに丸める
        //ROUND_HALF_UP	四捨五入する
        //ROUND_UNNECESSARY	丸め不要
        //ROUND_UP	0 から離れるように丸めるモード
        BigDecimal bd9 = new BigDecimal("12.5432");
        System.out.println(bd9 + "を0スケール目で丸めると");
        System.out.println(bd9.setScale(0, BigDecimal.ROUND_HALF_UP)); //小数第１位で四捨五入
        System.out.println(bd9 + "を1スケール目で丸めると");
        System.out.println(bd9.setScale(1, BigDecimal.ROUND_HALF_UP)); //小数第２位で四捨五入
        System.out.println(bd9 + "を2スケール目で丸めると");
        System.out.println(bd9.setScale(2, BigDecimal.ROUND_HALF_UP)); //小数第３位で四捨五入
//        System.out.println(bd9.setScale(2)); //12.51などでは例外が出る

        //subtract 減算を行う
        BigDecimal bd10 = new BigDecimal(100);
        BigDecimal bd11 = new BigDecimal(50);
        System.out.println(bd10 +  "-" + bd11 + "は");
        System.out.println(bd10.subtract(bd11));

        //toString 文字列表現を返す
        BigDecimal bd12 = new BigDecimal("0.123");
        System.out.println(bd12 + "の文字列表現は");
		System.out.println(bd12.toString());
        String s = bd12.toString();
		System.out.println(bd12 + "をString型に代入した結果は");
		System.out.println(s);

        //valueOf 基本型からBigDecimal型への型変換
		double do1 = 0.123;
		BigDecimal bd13 = BigDecimal.valueOf(do1);
		System.out.println("double型の変数" + do1 + "をBigDecimal型に変換すると");
		System.out.println(bd13);
		BigDecimal bd14 = new BigDecimal(Double.toString(do1));
		System.out.println("double型の変数" + do1 + "をnewを使ってBigDecimal型に変換すると");
		System.out.println(bd14);

		BigDecimal bd15 = BigDecimal.valueOf(100);
    }
}
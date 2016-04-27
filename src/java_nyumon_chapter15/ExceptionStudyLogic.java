package java_nyumon_chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 例外処理実践ロジック.
 *
 * @author masaki.gunji
 */
public class ExceptionStudyLogic {

    public void sub() throws IOException{
        System.out.println("sub start");

        subsub();

        System.out.println("sub end");
    }

    private void subsub() throws IOException {
    	try{
    		System.out.println("subsub start");

    		subsubsub();

    	} catch (FileNotFoundException e) {
            System.out.println("&");
        }
		System.out.println("subsub end");
    }

    private void subsubsub() throws FileNotFoundException,IOException {
        System.out.println("subsubsub start");

        try {
            // 文字列
            System.out.println("文字列の処理");
            String s1 = "あいう"; //s1の長さは3
            // TODO 実践1 s1にnullを代入する
//             s1 = null; //○が出力される。 NullPointerExceptionをcatch
            int s1Length = s1.length();
            System.out.println("s1の長さは" + s1Length);
            // TODO 実践4 文字列の3文字目を参照する
             s1.charAt(3); //java.lang.StringIndexOutOfBoundsException

            // 除算
            System.out.println("除算の処理");
            int i1 = 5;
            int i2 = 1;
            // TODO 実践2 i2に0を代入する
//             i2 = 0; //□が出力される。ArithmeticExceptionをcatch
            System.out.println(i1 / i2);

            // 配列
            System.out.println("配列開始します");
            int array[] = { 18, 29, 36 };
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            // TODO 実践3 index位置3の要素を参照する
//            System.out.println(array[3]); //△が出力される。ArrayIndexOutOfBoundsExceptionをcatch
            System.out.println("配列終了しました");

            // ファイル入出力
            // TODO 実践5 FileReaderを使用する
             String filePath = "";
             // FileReaderオブジェクトの生成
             FileReader fr = new FileReader(filePath);
             // ファイルから1文字データを読み込み
             int i = fr.read();
             // char型にキャストして出力
             System.out.print((char) i);
             // FileReaderのクローズ
             fr.close();

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("×");
        } catch (NullPointerException e) {
            System.out.println("○");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("△");
        } catch (ArithmeticException e) {
            System.out.println("□");
        } finally {
            System.out.println("finally");
        }
        System.out.println("subsubsub end");
    }
}
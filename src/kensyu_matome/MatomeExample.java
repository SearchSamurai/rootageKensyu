package kensyu_matome;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MatomeExample {

    private static final String SHIFT_JIS = "MS932";

    public List<String> getDivideString(String sOriginal, int iDevideLength) {

    	//指定されたバイト数ごとに区切った文字列を格納していくリスト
        List<String> result = new ArrayList<String>();

        //指定されたバイト数ごとに区切られた文字列を一時的に格納する変数
        StringBuilder record = new StringBuilder();

        //指定されたバイト数ごとに区切られた文字列のバイト数を格納する変数
        int bufLen = 0;

        //引数で渡された文字列の長さ分だけ繰り返し処理を行う
        for(int i = 0; i < sOriginal.length(); i++) {

        	//getBytesの戻り値格納用にbyteの配列型の変数を宣言しnullで初期化
            byte[] bytes = null;

            try {

            	//sOriginalのi~i+1番目の文字列のバイト数を格納。
                bytes = sOriginal.substring(i, i + 1).getBytes(SHIFT_JIS);

                //byte数がnullの場合だけループを抜ける
                if(bytes == null) {
                    continue;
                }

                //sOriginalのi~i+1番目の文字列のバイト数が、指定されたバイト数を超えた場合・・・
                if(bufLen + bytes.length > iDevideLength) {
                	//recordを文字列に変換してresultに追加
                    result.add(record.toString());
                    //recordをnewし直す
                    record = new StringBuilder();
                    //次の文字列のバイト数を取得するに向けて0を再代入
                    bufLen = 0;
                }

                //recordに、引数で渡された文字列のi~i+1番目の文字列を足す
                record.append(sOriginal.substring(i, i + 1));
                //バイト数を格納
                bufLen = bufLen + bytes.length;

            } catch(UnsupportedEncodingException ex) {
                // エンコード失敗した文字は無視
            }
        }

        //最後に残った文字列を格納
        if(record.length() != 0) {
            result.add(record.toString());
        }

        return result;
    }

}

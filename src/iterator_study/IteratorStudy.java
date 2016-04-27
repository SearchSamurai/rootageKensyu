package iterator_study;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

//        hasNext
//
//        boolean hasNext()
//        繰り返し処理でさらに要素がある場合に true を返します。つまり、next の呼び出しが例外をスローすることなく要素を返す場合は、true を返します。
//        戻り値:
//        反復子がさらに要素を持つ場合は true

//        next
//
//        E next()
//        繰り返し処理で次の要素を返します。
//        戻り値:
//        繰り返し処理で次の要素
//        例外:
//        NoSuchElementException - 繰り返し処理でそれ以上要素がない場合

//        MapのIteratorインタフェース
//
//        Mapインタフェースを実装したクラス（HashMap、TreeMap、LinkedHashMap）でIterator処理を行う場合は
//        Mapインタフェースで定義されているkeySetメソッド、valuesメソッド、entrySetメソッドを使用します。
//        これらのメソッドは返り値としてMapオブジェクトの要素を保持したCollectionオブジェクトを返します。
//        返されたCollectionオブジェクトからiteratorメソッドを呼び出し、Iterator処理を行います。
//        戻り型 		メソッド 								説明
//        Set 			keySet( ) 		呼び出したMapオブジェクトのKeyを保持したSetを返します。
//        Collection 	values( ) 		呼び出したMapオブジェクトの値を保持したCollectionを返します。
//        Set 			entrySet( ) 	呼び出したMapオブジェクトのKeyと値のペアを保持したSetを返します。

        // エントリの追加
        map.put("あ", "日本");
        map.put("い", "中国");
        map.put("う", "アメリカ");

        // 格納した要素を取得するメソッド
        System.out.println("格納した要素を取得するメソッド");

        // keySet キー全部を取得する
        System.out.println("--- keySet キー全部を取得する ---");
        Set<String> keys = map.keySet();
        Iterator<String> allKeys = keys.iterator();
        while (allKeys.hasNext()) {
            String key = allKeys.next();
            System.out.println("key: " + key);
            System.out.println("value: " + map.get(key));
        }

        //for文の場合(iteratorを使用する)		スコープを短くできるという利点がある。
        for(Iterator<String> it = map.keySet().iterator(); it.hasNext();){
        	it.next();
        }

        // values 値全部を取得する
        System.out.println("--- values 値全部を取得する ---");
        Collection<String> values = map.values();
        Iterator<String> allValues = values.iterator();
        while (allValues.hasNext()) {
            String value = allValues.next();
            System.out.println("value: " + value);
        }

        // entrySet エントリ(キーと値のペア)全部を取得する
        System.out.println("--- entrySet エントリ(キーと値のペア)全部を取得する ---");
        Set<Map.Entry<String, String>> entrySets = map.entrySet();
        Iterator<Map.Entry<String, String>> entries = entrySets.iterator();
        while (entries.hasNext()) {
        	Map.Entry<String, String> entry = entries.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
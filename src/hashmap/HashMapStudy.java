package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Map<K, V> map = new HashMap<K, V>();
        // K - キー(Key)の型
        // V - 値(Value)の型

        Map<String, String> map = new HashMap<String, String>();
        // エントリの追加
        map.put("あ", "日本");
        map.put("い", "中国");
        map.put("う", "アメリカ");

        // 順序は保証されないため出力順序はランダム
        // 但し、Eclipseでは実行結果がキャッシュされ、毎回同じ順序で出力される可能性がある
        System.out.println(map);

        // もし既存と同じキーで put した場合、要素は追加ではなく上書きされる
        // map.put("あ", "イタリア");
        // System.out.println(map);

        // 値の取得
        String v = map.get("い");
        System.out.println(v);
    	System.out.println("----------ここまで例題----------" + "\n");


    	System.out.println("----------ここからclear----------");
//		全てのエントリをまとめて削除する
//    	nullになるわけではなく、sizeに0がセットされる。空のマップを出力すると{}となる。
//    	引数なし		戻り値なし
//        public void clear() {
//            modCount++;
//            Entry[] tab = table;
//            for (int i = 0; i < tab.length; i++)
//                tab[i] = null;
//            size = 0;
//        }
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("りんご", Integer.valueOf(10));
        map1.put("みかん", Integer.valueOf(20));
        System.out.println("map1が持つエントリを出力します。");
        System.out.println(map1);
        System.out.println("map1が持つエントリを削除します。");
//        System.out.println(map1.clear()); //clearメソッドの戻り値はvoidなのでエラー
        map1.clear();
        System.out.println("map1が持つエントリを出力します。");
        System.out.println(map1);
    	System.out.println("----------ここまでclear----------" + "\n");


    	System.out.println("----------ここからcontainsKey----------");
//		キーがマップに登録されているかどうかを確認する。
//    	引数Object key		戻り値boolean
//        public boolean containsKey(Object key) {
//            return getEntry(key) != null;
//        }
        map1.put("りんご", Integer.valueOf(10));
        map1.put("みかん", Integer.valueOf(20));
//        map1.put(null, Integer.valueOf(20));
        System.out.println("map1が持つエントリを出力します。");
        System.out.println(map1);
        System.out.println("map1が\"りんご\"というキーを持っているか判定します。");
        System.out.println(map1.containsKey("りんご"));
        System.out.println("map1が\"メロン\"というキーを持っているか判定します。");
        System.out.println(map1.containsKey("メロン"));
//        System.out.println("map1内のキーにnullがあるかを判定します。");
//        System.out.println(map1.containsKey(null)); //true
    	System.out.println("----------ここまでcontainsKey----------" + "\n");


    	System.out.println("----------ここからget----------");
//		指定されたキーにマップされている値を返します。マップがこのキー
//    	のマッピングを保持していない場合は null を返します。戻り値の null は、マップがキーのマッピ
//    	ングを保持していないことを示すとは限らない。つまり、マップが明示的にキーを null にマッ
//    	プしていることもある。←containsKeyメソッドを使うとその違いを見分けられる。
//    	引数Object key		戻り値V(value)
//        public V get(Object key) {
//            if (key == null)
//                return getForNullKey();
//            int hash = hash(key.hashCode());
//            for (Entry<K,V> e = table[indexFor(hash, table.length)];
//                 e != null;
//                 e = e.next) {
//                Object k;
//                if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
//                    return e.value;
//            }
//            return null;
//        }
//-------------------getForNullKey()------------------
//        private V getForNullKey() {
//            for (Entry<K,V> e = table[0]; e != null; e = e.next) {
//                if (e.key == null)
//                    return e.value;
//            }
//            return null;
//        }
    	map1.put(null, Integer.valueOf(30));
        System.out.println("map1が持つエントリを出力します。");
        System.out.println(map1);
        Integer num = map1.get("みかん");
        System.out.println("map1内のキー\"みかん\"が持つ値を出力します。");
        System.out.println(num);
        System.out.println("map1内のキー\"みかん\"が持つ値を直接出力します。");
        System.out.println(map1.get("みかん"));
        Integer num1 = map1.get("メロン");
        System.out.println("map1内のキー\"メロン\"が持つ値を出力します。");
        if(num1 == null){
        	System.out.println("キーがありませんでしたのでnullを返します。");
        }
        System.out.println(num1);
        Integer num2 = map1.get(null);
        System.out.println("map1内のキーnullが持つ値を出力します。");
        System.out.println(num2);
    	System.out.println("----------ここまでget----------" + "\n");


    	System.out.println("----------ここからisEmpty----------");
//    	エントリが存在しない場合はtrueを返す。
//    	引数なし		戻り値boolean
//        public boolean isEmpty() {
//            return size == 0;
//        }
        System.out.println("map1が持つエントリを出力します。");
        System.out.println(map1);
        System.out.println("map1がエントリを持たないかどうか判定します。");
        System.out.println(map1.isEmpty());
        map1.clear();
        System.out.println("map1がエントリを持たないかどうか判定します。");
        System.out.println(map1.isEmpty());
    	System.out.println("----------ここまでisEmpty----------" + "\n");


    	System.out.println("----------ここからput----------");
//    	マップにエントリを追加する。マップが以前にこのキーのマッピング
//    	を保持していた場合、古い値が置き換えられます。
//
//    	引数:K key, V value   	戻り値:V(value)
//
//    	パラメータ:
//    	  key - 指定される値が関連付けられるキー
//    	  value - 指定されるキーに関連付けられる値
//    	  指定されたキーに関連した値。または、キーのマッピングがなかった場合はnull。戻り値 null
//    	    は、HashMap が以前に null と指定されたキーを関連付けていたことを示す場合もある。
//        public V put(K key, V value) {
//            if (key == null)
//                return putForNullKey(value);
//            int hash = hash(key.hashCode());
//            int i = indexFor(hash, table.length);
//            for (Entry<K,V> e = table[i]; e != null; e = e.next) {
//                Object k;
//                if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
//                    V oldValue = e.value;
//                    e.value = value;
//                    e.recordAccess(this);
//                    return oldValue;
//                }
//            }
//
//            modCount++;
//            addEntry(hash, key, value, i);
//            return null;
//        }

        map1.put("りんご", Integer.valueOf(10));
        map1.put("みかん", Integer.valueOf(20));
    	map1.put(null, Integer.valueOf(30));
        System.out.println("map1が持つエントリを全て出力します。");
        System.out.println(map1);
        System.out.println("map1が持つキー\"みかん\"が持つ値を上書きします。");
        map1.put("みかん", Integer.valueOf(50));
        System.out.println("map1が持つエントリを全て出力します。");
        System.out.println(map1);
        System.out.println("map1が持つキー\"りんご\"が持つ値を出力します。");
        System.out.println(map1.put("りんご", Integer.valueOf(100))); //ここではまだ10が出力される。
        System.out.println("map1が持つエントリを全て出力します。"); //ここで"りんご"内の100が出力される。
        System.out.println(map1);
    	System.out.println("----------ここまでput----------" + "\n");


    	System.out.println("----------ここからputAll----------");
//		指定されたマップを別のマップに追加する。
//    	引数???		戻り値void
//    	public void putAll(Map<? extends K, ? extends V> m) {
//            int numKeysToBeAdded = m.size();
//            if (numKeysToBeAdded == 0)
//                return;
//
//            /*
//             * Expand the map if the map if the number of mappings to be added
//             * is greater than or equal to threshold.  This is conservative; the
//             * obvious condition is (m.size() + size) >= threshold, but this
//             * condition could result in a map with twice the appropriate capacity,
//             * if the keys to be added overlap with the keys already in this map.
//             * By using the conservative calculation, we subject ourself
//             * to at most one extra resize.
//             */
//            if (numKeysToBeAdded > threshold) {
//                int targetCapacity = (int)(numKeysToBeAdded / loadFactor + 1);
//                if (targetCapacity > MAXIMUM_CAPACITY)
//                    targetCapacity = MAXIMUM_CAPACITY;
//                int newCapacity = table.length;
//                while (newCapacity < targetCapacity)
//                    newCapacity <<= 1;
//                if (newCapacity > table.length)
//                    resize(newCapacity);
//            }
//
//            for (Iterator<? extends Map.Entry<? extends K, ? extends V>> i = m.entrySet().iterator(); i.hasNext(); ) {
//                Map.Entry<? extends K, ? extends V> e = i.next();
//                put(e.getKey(), e.getValue());
//            }
//        }
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        Map<String, Integer> map2_1 = new HashMap<String, Integer>();
        map2.put("バナナ", Integer.valueOf(200));
        map2.put("いちご", Integer.valueOf(300));
    	map2.put("キウイ", Integer.valueOf(400));
        System.out.println("map1が持つエントリを全て出力します。");
        System.out.println(map1);
        System.out.println("map2が持つエントリを全て出力します。");
        System.out.println(map2);
        System.out.println("map1が持つエントリにmap2のエントリを追加します。");
//        System.out.println(map1.putAll(map2)); 戻り値はvoidなのでエラー
    	map1.putAll(map2);
        System.out.println("map1が持つエントリを全て出力します。");
    	System.out.println(map1);
        System.out.println("map2が持つエントリを全て出力します。");
    	System.out.println(map2);

    	map2_1.putAll(map2);
        System.out.println("map2が持つエントリを全て出力します。");
    	System.out.println(map2);
    	System.out.println("----------ここまでputAll----------" + "\n");


    	System.out.println("----------ここからremove----------");
//    	指定したエントリをマップから削除する。
//    	引数Object key		戻り値V(value)
//        public V remove(Object key) {
//            Entry<K,V> e = removeEntryForKey(key);
//            return (e == null ? null : e.value);
//        }
        System.out.println("map1が持つエントリを全て出力します。");
        System.out.println(map1);
        System.out.println("\"いちご\"を削除します。");
//      System.out.println(map1.remove("いちご")); //300が出力される
        map1.remove("いちご");
        System.out.println("map1が持つエントリを全て出力します。");
        System.out.println(map1);
//        System.out.println(map1.remove("aaa")); //無い値はnull
    	System.out.println("----------ここまでremove----------" + "\n");


    	System.out.println("----------ここからsize----------");
//    	マップの要素数を取得する。
//    	引数なし	戻り値int
//        public int size() {
//            return size;
//        }
    	System.out.println("map1のエントリ数を出力します。");
    	System.out.println(map1.size());
    	System.out.println("----------ここまでsize----------");

        Map<String, ArrayList<String>> map3 = new HashMap<String, ArrayList<String>>();
    	ArrayList<String> array1 = new ArrayList<String>();
    	array1.add("あ"); // 0
    	array1.add("あ"); // 1
    	array1.add("あ"); // 2
    	array1.add("い"); // 3
    	array1.add("い"); // 4
    	array1.add("う"); // 5
    	array1.add("え"); // 6
    	array1.add("え"); // 7
        map3.put("テスト", array1);
        System.out.println(map3);
    }
}
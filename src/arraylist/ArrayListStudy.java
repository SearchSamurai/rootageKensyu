package arraylist;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListStudy {

            public static void main(String[] args) {
            	System.out.println("----------ここから例題----------");
//              まずは下記のとおりに記述する
                ArrayList<Integer> li1 = new ArrayList<Integer>();
//              どうなりましたか?
//              Integer num = new Integer(1);
//              li1.add(num);
//              li1.add(new Integer(1));
                li1.add(Integer.valueOf(10));
                System.out.println(li1.get(0));

//                LinkedList<Integer> li2 = new LinkedList<Integer>();
            	System.out.println("----------ここまで例題----------" + "\n");


            	System.out.println("----------ここからadd----------");
//              public boolean add(E e) {
//              ensureCapacityInternal(size + 1);  // Increments modCount!!
//              elementData[size++] = e;
//              return true;
//            	リストの一番最後にデータが追加される。
//            	例えば文字列を格納するArrayListを作成して、要素を格納する場合は下記のようになる。
//              大きさを自動的に拡張してくれるので、格納する要素の数を気にすることなく追加できる。
//              また格納された要素は、格納された順に0から始まるインデックス番号が付けられる。
            	ArrayList<String> array = new ArrayList<String>();
            	array.add("日本"); //インデックス番号0    array.add(0,"日本");
            	array.add("ブラジル"); //インデックス番号1
            	array.add("イングランド"); //インデックス番号2
            	System.out.println("arrayに格納された要素全てを出力します。");
            	System.out.println(array);
            	System.out.println("arrayに格納された2番目の要素を出力します。");
            	System.out.println(array.get(1));
            	System.out.println("arrayに格納された2番目の要素を書き換えます。");
//            	System.out.println(array.set(1, "インド")); //セットしているが出力されるのはブラジル。この文の次にsysoutすればインドが出力される。
            	array.set(1, "インド");
            	System.out.println("arrayに格納された2番目の要素を出力します。");
            	System.out.println(array.get(1) + "\n");

            	ArrayList<Integer> array1 = new ArrayList<Integer>();
            	array1.add(Integer.valueOf(10)); //array1.add(0,10);と同義。
            	array1.add(Integer.valueOf(1));
            	array1.add(Integer.valueOf(12));
//            	array1.add(0,35); //この場合は35,10,1,12になる。最後尾の次の番号より大きいインデックス番号を第一引数で指定するとjava.lang.IndexOutOfBoundsExceptionが出る。
            	System.out.println("array1に格納された要素全てを出力します。");
            	System.out.println(array1);
            	System.out.println("array1に格納された3番目の要素を出力します。");
            	System.out.println(array1.get(2));
            	System.out.println("arrayに格納された3番目の要素を書き換えます。");
            	array1.set(2, Integer.valueOf(5));
            	System.out.println("arrayに格納された3番目の要素を出力します。");
            	System.out.println(array1.get(2));
            	System.out.println("----------ここまでadd----------" + "\n");


            	System.out.println("----------ここからaddAll----------");
//        		引数を指定しなければ、リストの末尾にリストをリストごと追加する。
//				引数をした場合は、そのインデックス番号の位置にリストごと追加する。
//              public boolean addAll(Collection<? extends E> c) {
//              Object[] a = c.toArray();
//              int numNew = a.length;
//              ensureCapacityInternal(size + numNew);  // Increments modCount
//              System.arraycopy(a, 0, elementData, size, numNew);
//              size += numNew;
//              return numNew != 0;
//            	戻り値:boolean
            	ArrayList<String> array2 = new ArrayList<String>();
            	ArrayList<String> array3 = new ArrayList<String>();

            	array2.add("あいうえお");
            	array2.add("かきくけこ");
            	array2.add("さしすせそ");
            	array3.add("たちつてと");
            	array3.add("なにぬねの");
            	array3.add("はひふへほ");

            	System.out.println("array2にarray3を追加します。");
            	array2.addAll(array3);
            	System.out.println("array2を出力します。");
            	System.out.println(array2); //[あいうえお, かきくけこ, さしすせそ, たちつてと, なにぬねの, はひふへほ]
//            	array2.addAll(0,array3);
//            	System.out.println(array2); //[たちつてと, なにぬねの, はひふへほ,あいうえお, かきくけこ, さしすせそ]
            	System.out.println("array3を出力します。");
            	System.out.println(array3); //[たちつてと, なにぬねの, はひふへほ]
            	System.out.println("----------ここまでaddAll----------" + "\n");


            	System.out.println("----------ここからclear----------");
//        		リストからすべての要素を削除する。この呼び出しが戻ると、このリストは空になる。
//            	public void clear()
//              modCount++;
//             // Let gc do its work
//                    for (int i = 0; i < size; i++)
//                        elementData[i] = null;
//                    size = 0;
//             }
            	ArrayList<String> array4 = new ArrayList<String>();
            	array4.add("東京");
            	array4.add("大阪");
            	array4.add("東京");
            	array4.add("千葉");
            	System.out.println("array4に格納された要素全てを出力します。");
            	System.out.println(array4);
            	System.out.println("array4に格納された要素全てを削除します。");
//            	System.out.println(array4.clear()); 型 PrintStream のメソッド println(boolean) は引数 (void) に適用できません。
            	array4.clear();
            	System.out.println("array4に格納された要素全てを出力します。");
            	System.out.println(array4); //[]
            	System.out.println("----------ここまでclear----------" + "\n");


            	System.out.println("----------ここからget----------");
//            	インデックス番号を指定して、その番号に対応した要素を取り出す。
//              public E get(int index) {
//                  rangeCheck(index);
//                  return elementData(index);
//              }
//            	例外:
//            	IndexOutOfBoundsException - インデックスが範囲外の場合
//            	(index < 0 || index >= size())
            	ArrayList<String> array5 = new ArrayList<String>();
                array5.add("日本");
                array5.add("ブラジル");
                array5.add("イングランド");
                array5.add("ポルトガル");
                array5.add("フランス");
                String country = array5.get(2);
            	System.out.println("array5に格納された3番目の要素を出力します。");
            	System.out.println(array5.get(2));
                System.out.println(country);

            	ArrayList<Integer> array6 = new ArrayList<Integer>();
            	array6.add(Integer.valueOf(10));
            	array6.add(Integer.valueOf(11));
            	array6.add(Integer.valueOf(12));
            	Integer x = array6.get(0);
            	System.out.println("array6に格納された1番目の要素を出力します。");
            	System.out.println(array6.get(0));
                System.out.println(x);
            	System.out.println("----------ここまでget----------" + "\n");


            	System.out.println("----------ここからindexOf----------");
//        		public int indexOf(Object elem)
//        		equalsメソッドを使って等しいかどうかを判定しながら、指定された引数と同じ内容の要素を先頭から検索し、
//            	リスト内で引数が最初に現れるインデックス番号を返す。オブジェクトが見つからない場合は -1
//            	最後から検索するための"lastIndexOf"メソッドも用意されている。
//                public int indexOf(Object o) {
//                    if (o == null) {
//                        for (int i = 0; i < size; i++)
//                            if (elementData[i]==null)
//                                return i;
//                    } else {
//                        for (int i = 0; i < size; i++)
//                            if (o.equals(elementData[i]))
//                                return i;
//                    }
//                    return -1;
//                }
//                public int lastIndexOf(Object o) {
//                    if (o == null) {
//                        for (int i = size-1; i >= 0; i--)
//                            if (elementData[i]==null)
//                                return i;
//                    } else {
//                        for (int i = size-1; i >= 0; i--)
//                            if (o.equals(elementData[i]))
//                                return i;
//                    }
//                    return -1;
//                }
            	ArrayList<String> array7 = new ArrayList<String>();

            	array7.add("東京");
            	array7.add("大阪");
            	array7.add("東京");
            	array7.add("千葉");

            	System.out.println("array7の先頭から\"東京\"を探し、最初に現れるインデックス番号を返します。見つからない場合は-1を返します。");
            	System.out.println(array7.indexOf("東京"));      // 0
            	System.out.println("array7の先頭から\"神奈川\"を探し、最初に現れるインデックス番号を返します。見つからない場合は-1を返します。");
            	System.out.println(array7.indexOf("神奈川"));      // -1
            	System.out.println("array7の最後尾から\"東京\"を探し、最初に現れるインデックス番号を返します。見つからない場合は-1を返します。");
            	System.out.println(array7.lastIndexOf("東京"));  // 2
            	System.out.println("----------ここまでindexOf----------" + "\n");


            	System.out.println("----------ここからisEmpty----------");
//        		リストが空であるかを判定する。空であればtrueを、そうでなければfalseを返す。 戻り値:boolean
//                public boolean isEmpty() {
//                    return size == 0;
//                }
            	ArrayList<Integer> array8 = new ArrayList<Integer>();

            	array8.add(Integer.valueOf(10));
            	array8.add(Integer.valueOf(20));
            	array8.add(Integer.valueOf(30));
            	array8.add(Integer.valueOf(40));
            	System.out.println("array8の中身が空であるかを判定します。");
            	System.out.println(array8.isEmpty());

            	System.out.println("array8の中身を空にします。");
            	array8.clear();
            	System.out.println("array8の中身が空であるかを判定します。");
            	System.out.println(array8.isEmpty());
            	System.out.println("----------ここまでisEmpty----------" + "\n");


            	System.out.println("----------ここからremove----------");
//            	リスト内の指定された位置から要素を削除する。
//            	そして、後続の要素を左側に移動し、それぞれのインデックスから 1 を減算する。
//            public E remove(int index) {
//                rangeCheck(index);
        //
//                modCount++;
//                E oldValue = elementData(index);
        //
//                int numMoved = size - index - 1;
//                if (numMoved > 0)
//                    System.arraycopy(elementData, index+1, elementData, index,
//                                     numMoved);
//                elementData[--size] = null; // Let gc do its work
        //
//                return oldValue;
//            }
//            	パラメータ:
//            	  index - 削除される要素のインデックス
//            	戻り値:
//            	  リストから削除した要素
//            	例外:
//            	  IndexOutOfBoundsException - インデックスが範囲外の場合
//            	    (index < 0 || index >= size())

            	ArrayList<String> array9 = new ArrayList<String>();

            	array9.add("東京");
            	array9.add("大阪");
            	array9.add("東京");
            	array9.add("大阪");

                System.out.println("array9に格納された要素全てを出力します。");
                System.out.println(array9);
                System.out.println("3番目の項目を削除します");
                System.out.println(array9.remove(2) + "を削除します。"); //東京
                System.out.println(array9); //[東京, 大阪, 千葉]

                System.out.println("indexOfで検索した項目を削除します。");
                System.out.println(array9.remove("大阪") + "を削除します。"); //大阪
//                System.out.println(array9.remove(array9.indexOf("大阪")) + "を削除します。");
                System.out.println("array9に格納された要素全てを出力します。");
                System.out.println(array9); //[東京, 千葉]
            	System.out.println("----------ここまでremove----------" + "\n");


            	System.out.println("----------ここからset----------");
//            	リストの指定された位置にある要素を、指定された要素に置き換える。

//        		パラメータ:
//          	index - 置換される要素のインデックス
//          	element - 指定された位置に格納される要素
//        		戻り値:
//          	指定された位置に以前あった要素
//        		例外:
//          	IndexOutOfBoundsException - インデックスが範囲外の場合
//           	 (index < 0 || index gt;= size())

//                public E set(int index, E element) {
//                    rangeCheck(index);
        //
//                    E oldValue = elementData(index);
//                    elementData[index] = element;
//                    return oldValue;
//                }

                ArrayList<String> array10 = new ArrayList<String>();

                array10.add("日本");
                array10.add("ブラジル");
                array10.add("イングランド");
                array10.add("ポルトガル");
                array10.add("フランス");

            	System.out.println("array10に格納された要素全てを出力します。");
                System.out.println(array10);

            	System.out.println("array10に格納された3番目の要素をギリシャに書き換えます。");
                array10.set(2, "ギリシャ");
                System.out.println(array10);

            	System.out.println("array10に格納された要素の中から\"ギリシャ\"があれば\"ドイツ\"に書き換えます。");
                array10.set(array10.indexOf("ギリシャ"),("ドイツ")); //リストに無い要素を指定した場合はException in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1が出る。
                System.out.println(array10);
            	System.out.println("----------ここまでset----------" + "\n");


            	System.out.println("----------ここからsize----------");
//        		現在格納されている要素数を確認する。
//            	配列と異なりArrayListクラスのオブジェクトにはいくつの要素が格納されているか決まっていないため、
//            	このメソッドを用いて登録されている要素数を確認する。
//                public int size() {
//                    return size;
//                }
                ArrayList<String> array11 = new ArrayList<String>();
                array11.add("日本");
                array11.add("ブラジル");
                array11.add("イングランド");
                array11.add("ポルトガル");
                array11.add("フランス");

                System.out.println("登録データ数:" + array11.size());

                for (int i = 0 ; i < array11.size() ; i++){
                  System.out.println(array11.get(i));
                }
            	System.out.println("----------ここまでsize----------" + "\n");


            	System.out.println("----------ここからtoArray----------");
//            	リストを配列に変換して返す。
//            	toArrayの引数は変換先の配列の一つ目のデータである。
//            	引数で空インスタンスを渡さないと、Object[]として返すのでClassCastExceptionが発生します。

//              引数として与えられた配列に全要素が収まる場合は、
//            	引数として与えられた配列に全要素を収め、その配列を戻り値として返す。

//            	引数として与えられた配列に全要素が収まらない場合は、引数として与えられた配列と同じ型の配列を新規に生成し、
//            	新規に生成された配列に全要素をセットして戻り値として返す

//              コレクションの要素の型が、引数として渡された配列の要素の型に代入できない場合は、
//            	例外（java.lang.ArrayStoreException）を発生する。

//              toArray(Object[])メソッドの引数に要素が0個の配列をセットすると、
//            	引数にセットされた配列と同じ型で、当該Collectionの全要素がセットされた新規配列を返す。


//                @SuppressWarnings("unchecked")
//                public <T> T[] toArray(T[] a) {
//                    if (a.length < size)
//                        // Make a new array of a's runtime type, but my contents:
//                        return (T[]) Arrays.copyOf(elementData, size, a.getClass());
//                    System.arraycopy(elementData, 0, a, 0, size);
//                    if (a.length > size)
//                        a[size] = null;
//                    return a;
//                }
        //
//                // Positional Access Operations
        //
//                @SuppressWarnings("unchecked")
//                E elementData(int index) {
//                    return (E) elementData[index];
//                }

                ArrayList<String> array12 = new ArrayList<String>();
                array12.add("日本");
                array12.add("ブラジル");
                array12.add("イングランド");
                array12.add("ポルトガル");
                array12.add("フランス");

            	System.out.println("ArrayList型リストarray12をString型配列sに変換します。s1ではarray12のサイズを引数に指定します。");
//            	String[] s = array12.toArray(new String[]);
//            	String[] s = (String[])array12.toArray(); 以前の書き方
            	String[] s = array12.toArray(new String[0]); //サイズに収まらない場合は新たにオブジェクトが生成される。
            	String[] s1 = array12.toArray(new String[array12.size()]); //サイズで指定するとスッポリ収まるので効率が良い

//            	System.out.println(s); //[Ljava.lang.String;@3c0f3387

            	for(int i = 0; i < s.length; i++){
            		System.out.println("配列s[" + i + "}" + "の値は");
            		System.out.println(s[i]);
            	}
            	System.out.println();
            	for(int i = 0; i < s1.length; i++){
            		System.out.println("配列s1[" + i + "}" + "の値は");
            		System.out.println(s1[i]);
            	}
            	System.out.println("----------ここまでtoArray----------" + "\n");


            	System.out.println("----------【番外編】ここからasList----------");
            	System.out.println("Stirng型配列sをArrayList型リストarray13に変換します。");
            	ArrayList<String> array13 = new ArrayList<String>(Arrays.asList(s));

            	for(int i = 0; i < array13.size(); i++){
            		System.out.println("リストarray13のインデックス番号" + i + "番目の値は");
            		System.out.println(array13.get(i));
            	}

            	System.out.println();

//            	int[] i1 = {0,1,2,3,4};
//            	for(int i = 0; i < i1.length; i++){
//            		System.out.println("配列i1[" + i + "}" + "の値は");
//            		System.out.println(i1[i]);
//            	}

//            	ArrayList<Integer> array14 = new ArrayList<Integer>(Arrays.asList(i1)); //コンストラクター ArrayList<Integer>(List<int[]>) は未定義です。
//            	ArrayList<int[]> array14 = new ArrayList<int[]>(Arrays.asList(i1));
//            	System.out.println(array14); //[[I@592fa617]

//            	for(int i = 0; i < array14.size(); i++){
//            		System.out.println("リストarray14のインデックス番号" + i + "番目の値は");
//            		System.out.println(array14.get(i)); リストarray14のインデックス番号0番目の値は[I@592fa617
//            	}

            	int[] num = {0, 1, 2, 3, 4};
            	System.out.println("numに格納された値を順に表示します。");
            	for(int i = 0; i < num.length; i++){
            		System.out.println("配列num[" + i + "}" + "の値は");
            		System.out.println(num[i]);
            	}

             	System.out.println();

                ArrayList<Integer> array14 = new ArrayList<Integer>();
                System.out.println("int型配列numに格納された値を順にarray14に代入し、");
                System.out.println("array14に格納された要素を順に表示します。");
            	for(int i = 0 ; i < num.length ; i++){
            		array14.add(Integer.valueOf(num[i]));
            		System.out.println("array14の" + i + "番目の値は");
            		System.out.println(array14.get(i));
            	}
            	System.out.println("----------【番外編】ここまでasList----------");
            }
        }
package arraylist;

import java.util.List;

public class ArrayListKadai {

	public static void method1(List<Object> l1) {
		System.out.println("-----ここからmethod1-----");
		for(int i = 0; i < l1.size(); i++){
			System.out.println(i + "番目:" + l1.get(i));
		}
		System.out.println("-----ここまでmethod1-----\n");
	}

	public static void method2(List<Object> l1) {
		System.out.println("-----ここからmethod2-----");
		System.out.println("0番目:" + l1.get(0));
		for(int i = 0; i < l1.size() - 1; i++){
			if(l1.get(i).equals(l1.get(i + 1)) == true){
				continue;
			} else {
			  System.out.println(i + 1 + "番目:" + l1.get(i + 1));
			}
		}
		System.out.println("-----ここまでmethod2-----\n");
	}

	public static void method3(List<Object> l1) {
		System.out.println("-----ここからmethod3-----");
		for(int i = 0; i < l1.size() - 1; i++){
			if(l1.get(i).equals(l1.get(i + 1)) == true){
				continue;
			}
			System.out.println(i  + "番目:" + l1.get(i));
		}
		System.out.println((l1.size() - 1) + "番目:" + l1.get(l1.size() - 1));
		System.out.println("-----ここまでmethod3-----");
	}

	 public void printEnd2(List<String> li) {
	        // リストの大きさ
	        int size = li.size();

	        for (int i = 0; i < size; i++) {
	            String element = li.get(i);
	            // 該当文字列が最後の格納位置を取得する
	            int last = li.lastIndexOf(element);
	            // lastIndexOf で F3 を押す(実装を開く)
	            // for文が使用されている
	            // for文のネストになる為、件数が多くなればなるほど、パフォーマンスに影響が出る

	            if (i == last) {
	                System.out.println(i + "番目: " + element);
	            }
	        }
	    }
}
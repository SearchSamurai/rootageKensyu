package extends_for;

import java.util.ArrayList;
import java.util.List;

public class ExtendsForKadai {
	public static void main(String[] args) {
		//一次元配列
		int[] array = new int[]{7, 5, 9, 0};
		//全要素を1つずつ画面出力する処理

		//通常for文
		System.out.println("-----ここから一次元配列の通常for文-----");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		System.out.println("-----ここまで一次元配列の通常for文-----\n");

		//拡張for文
		System.out.println("-----ここから一次元配列の拡張for文-----");
		for(int value : array){
			System.out.println(value);
		}
		System.out.println("-----ここまで一次元配列の拡張for文-----\n");

		//2次元配列	変数名:array2
		//通常for文
		System.out.println("-----ここから二次元配列の通常for文-----");
		int[][] array2 = new int[][]{{5,0,9},{4,2},{3,1,8,7}};
		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array2[i].length; j++){
				System.out.println(array2[i][j]);
			}
		}
		System.out.println("-----ここまで二次元配列の通常for文-----\n");

		//拡張for文
		System.out.println("-----ここから二次元配列の拡張for文-----");
		for (int[] array2_0 : array2) {
		    for (int value : array2_0) {
		        System.out.println(value);
		     }
		 }
		System.out.println("-----ここまで二次元配列の拡張for文-----\n");

		//一次元List		変数名:list1
		//通常for文
		System.out.println("-----ここからリストの通常for文-----");
	    List<Integer> list1 = new ArrayList<Integer>();
	    list1.add(Integer.valueOf(7));
	    list1.add(Integer.valueOf(5));
	    list1.add(Integer.valueOf(9));
	    list1.add(Integer.valueOf(0));

	    int list1Size = list1.size();

	    for(int i = 0; i < list1Size; i++){
	    	System.out.println(list1.get(i));
	    }
		System.out.println("-----ここまでリストの通常for文-----\n");

		//拡張for文
		System.out.println("-----ここからリストの拡張for文-----");
		for(Integer value : list1){
			System.out.println(value);
		}
		System.out.println("-----ここまでリストの拡張for文-----\n");

		//Listのネスト(listの中にリスト)	変数名:list2
		//通常for文
		System.out.println("-----ここからリストのネストの通常for文-----");
	    List<Integer> list2_0 = new ArrayList<Integer>();
	    list2_0.add(Integer.valueOf(5));
	    list2_0.add(Integer.valueOf(0));
	    list2_0.add(Integer.valueOf(9));

	    List<Integer> list2_1 = new ArrayList<Integer>();
	    list2_1.add(Integer.valueOf(4));
	    list2_1.add(Integer.valueOf(2));

	    List<Integer> list2_2 = new ArrayList<Integer>();
	    list2_2.add(Integer.valueOf(3));
	    list2_2.add(Integer.valueOf(1));
	    list2_2.add(Integer.valueOf(8));
	    list2_2.add(Integer.valueOf(7));

	    List<List<Integer>> list2 = new ArrayList<List<Integer>>();
	    list2.add(list2_0);
	    list2.add(list2_1);
	    list2.add(list2_2);

	    int list2size = list2.size();

		for(int i = 0; i < list2size; i++){
	    	for(int j = 0; j < list2.get(i).size(); j++){
	    		System.out.println(list2.get(i).get(j));
	    	}
	    }
		System.out.println("-----ここまでリストのネストの通常for文-----\n");

		//拡張for文
		System.out.println("-----ここからリストのネストの拡張for文-----");
		for (List<Integer> list3 : list2) {
			for(Integer value : list3){
		        System.out.println(value);
			}
		}
		System.out.println("-----ここまでリストのネストの拡張for文-----");
	}
}

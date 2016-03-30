package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListKadaiMain {

	public static void main(String[] args) {

    	List<Object> array1 = new ArrayList<Object>();
    	array1.add("あ"); // 0
    	array1.add("あ"); // 1
    	array1.add("あ"); // 2
    	array1.add("い"); // 3
    	array1.add("い"); // 4
    	array1.add("う"); // 5
    	array1.add("え"); // 6
    	array1.add("え"); // 7
//    	//別パターン
//    	array1.add("あ"); // 0
//    	array1.add("あ"); // 1
//    	array1.add("あ"); // 2
//    	array1.add("い"); // 3
//    	array1.add("い"); // 4
//    	array1.add("う"); // 5
//    	array1.add("え"); // 6
//    	array1.add("え"); // 7
//    	array1.add("え"); // 8
//    	array1.add("お"); // 9

    	ArrayListKadai.method1(array1);
    	ArrayListKadai.method2(array1);
    	ArrayListKadai.method3(array1);
	}
}
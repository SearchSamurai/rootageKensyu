package hairetsu;
public class ArrayStudy {
    public static void main(String[] args) {
    	int num;
    	num = 10;
    	System.out.println(num);

    	int[] array;
    	array = new int[]{30, 10, 70};
//    	array = new int[3];
//    	array[0] = 30;
//    	array[1] = 10;
//    	array[2] = 70;
    	final int[] a = {1,2,3};
    	a[0] = 0;
    	int[] b = new int[]{3};
//    	a = b;

    	System.out.println(array[0]);
    	System.out.println(array[1]);
    	System.out.println(array[2]);
//    	System.out.println(array[4]);
    	System.out.println("配列の長さは" + array.length);

    		for(int i = 0; i < array.length; i++){
    			System.out.println(array[i]);
    		}

    	int[] array2;
    	array2 = array;
    	array2[0] = 100;
    	System.out.println(array[0]);

    	array = null;
    	array[0] = 10;
    }
}
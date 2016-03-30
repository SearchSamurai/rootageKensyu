package java_nyumon_chapter;
public class Main5_8 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args){
		System.out.println(add(add(10, 20), add(30, 40)));
//								   30に化ける               70に化ける
//                                 次はadd(30, 70)の引数を持ってaddメソッドが再び呼び出され、
//		                                                 100がaddメソッドより戻される。
	}
}

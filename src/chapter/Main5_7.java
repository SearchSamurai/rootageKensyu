package chapter;
public class Main5_7 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args){
		int ans = add(100, 10); //addメソッドの呼び出し(110に化ける)
		System.out.println("100 + 10 = " + ans);
	}
}

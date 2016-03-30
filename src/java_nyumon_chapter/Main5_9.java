package java_nyumon_chapter;
public class Main5_9 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB(){
//	public static int methodB(){
		System.out.println("methodB");

//		return 1; //return文はメソッドの終了も行うので、下の行は実行されず「到達不能エラー」が出る。
//		int x = 10;
	}
	public static void main(String[] args){
		methodA();
	}

}

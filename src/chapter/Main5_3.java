package chapter;
public class Main5_3 {
	public static void methodA() {
		System.out.println("methodA");
		methodB(); //methodBメソッドの呼び出し
	}
	public static void methodB(){
		System.out.println("methodB");
	}
	public static void main(String[] args){
		methodA(); //methodAメソッドの呼び出し
	}

}

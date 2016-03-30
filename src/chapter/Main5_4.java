package chapter;
public class Main5_4 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊"); //"湊"を渡してhelloメソッドを呼び出し
		hello("朝香"); //"朝香"を渡してhelloメソッドを呼び出し
		hello("菅原"); //"菅原"を渡してhelloメソッドを呼び出し
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name){
		System.out.println(name + "さん、こんにちは");
	}
}

package java_nyumon_chapter10;

public class HeroMain {
	public static void main(String[] args){
		Hero h1 = new Hero();
		//フィールドに代入
//		h1.name = "さとう";
		h1.setName("さとう");
		//フィールドの値を取得
//		String s1 = h1.name;
		String s1 = h1.getName();
		//画面出力
		System.out.println(s1);
	}
}
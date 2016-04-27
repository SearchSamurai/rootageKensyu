package java_nyumon_chapter8;

public class HeroMain {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Hero h1 = new Hero();
		Hero h2 = new Hero();

		h1.name = "さとう";
		h1.hp = 100;

		h2.name = "すずき";
		h2.hp = 20;

		h1.run("いとう");
		h2.run("かとう");

		System.out.println(h1.name); //さとう    staticあり  さとう
		System.out.println(h1.hp); //100  staticあり  20
		System.out.println(h2.name); //すずき  staticあり  すずき
		System.out.println(h2.hp); //100  staticあり  20
	}
}
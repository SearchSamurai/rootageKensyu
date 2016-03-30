package chapter8;

public class Hero {
	String name;
	static int hp;

	public void run(String name){
		System.out.println(this.name + "は走った");
		System.out.println(name + "は走った");
	}
}
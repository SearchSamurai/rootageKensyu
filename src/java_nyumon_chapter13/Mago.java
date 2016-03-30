package java_nyumon_chapter13;

public class Mago extends Ko {

    int num = 30;
    static int NUM2 = 300;

    public Mago() {
    	super();
        System.out.println("Magoクラスのコンストラクタ");
        System.out.println(super.num);
    }

    // メソッドを定義する
    public void ccc() {
        System.out.println("Magoのcccメソッド");
    }

    public void eee() {
        System.out.println("Magoのeeeメソッド");
    }

    public void fff() {
        System.out.println("Magoのfffメソッド");
    }

    public void ggg() {
        System.out.println("Magoのgggメソッド");
    }
}
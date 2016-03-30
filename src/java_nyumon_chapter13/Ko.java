package java_nyumon_chapter13;

public class Ko extends Oya {

    int num = 20;
    static int NUM2 = 200;

    public Ko() {
//        super();
         super("hoge");
        System.out.println("Koクラスのコンストラクタ");
    }

    // メソッドを定義する
    public void bbb() {
        System.out.println("Koのbbbメソッド");
    }

    public void ddd() {
        System.out.println("Koのdddメソッド");
    }

    public void fff() {
        System.out.println("Koのfffメソッド");
    }

    public void ggg() {
        System.out.println("Koのgggメソッド");
    }
}
package chapter13;

public class Oya {

    int num = 10;
    static int NUM2 = 100;

    public Oya() {
        System.out.println("Oyaクラスのコンストラクタ");
    }

     // コンストラクタのオーバーロード
     public Oya(String name) {
     System.out.println("Oyaクラスのコンストラクタ2");
     }

    // メソッドを定義する
    public void aaa() {
        System.out.println("Oyaのaaaメソッド");
    }

    public void ddd() {
        System.out.println("Oyaのdddメソッド");
    }

    public void eee() {
        System.out.println("Oyaのeeeメソッド");
    }

    public void ggg() {
        System.out.println("Oyaのgggメソッド");
    }
}
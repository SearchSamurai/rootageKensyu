package java_nyumon_chapter;
public class Hero {
    String name; //名前の宣言
    int hp; //HPの宣言
    void sleep(){
    	this.hp = 100;
    	System.out.println(this.name + "は、眠って回復した！");
    }
    void sit(int sec){
    	this.hp += sec;
    	System.out.println(this.name + "は、" + sec + "秒座った！");
    	System.out.println("HPが" + sec + "ポイント回復した.");
    }
    void slip(){
    	this.hp -= 5;
    	System.out.println(this.name + "は、転んだ！");
    	System.out.println("5のダメージ！");
    }
    void run(){
    	System.out.println(this.name + "は、逃げ出した！");
    	System.out.println("GAMEOVER");
    	System.out.println(this.name + "最終HPは" + this.hp + "でした");
    }
}
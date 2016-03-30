package java_nyumon_chapter;
public class Main4_1 {
    public static void main(String[] args) {
    	int sansu = 20;
    	int kokugo = 30;
    	int rika = 40;
    	int eigo = 50;
    	int syakai = 80;

    	int sum = sansu + kokugo + rika + eigo + syakai; //合計の算出

    	int avg = sum / 5; //平均の算出

    	System.out.println("合計点" + sum);
    	System.out.println("平均点" + avg); //←↑合計と平均の表示
    }
}
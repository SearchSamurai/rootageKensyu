package java_nyumon_chapter;
//従来のfor文での例
//public class Main4_10{
//	public static void main(String[] args) {
//		int[] score = { 20, 30, 40, 50, 80 };
//		for(int i = 0; i < score.length; i++){ 配列名.lengthで要素数を得る。
//			System.out.println(score[i]); 要素を指定して取り出す必要がある。
//		}
//	}
//}

public class Main4_10_11{
	public static void main(String[] args) {
		int[] score = { 20, 30, 40, 50, 80 };
		for(int value : score){
			System.out.println(value);
		}
	}
}
//事前準備2. ExamSummaryMain クラスを作成する
//
//    main()メソッド有りでクラスを作成すること
//
//実践
//
//ExamSummaryMainクラスのmain()メソッドに下記の処理を作成する
//
//    register メソッドを呼び出し、3科目×6人分のデータを登録する
//    getScore メソッドを呼び出し取得したデータ、を画面に表示する
//    getTopScoreIdsBySubject メソッドを呼び出し取得したデータ、を画面に表示する
//    getIdsByAverage メソッドを呼び出し取得したデータ、を画面に表示する
//
//ExamSummary クラスの使用例は下記の通り
//
//// ExamSummaryクラスのオブジェクトを生成
//ExamSummary es = new ExamSummary();
//// registerメソッドを呼び出してデータを登録する
//// 一人目
//es.register("KC001", "MATH", 95);
//es.register("KC001", "SCIENCE", 80);
//es.register("KC001", "ENGLISH", 70);
//// 二人目
//es.register("KC002", "MATH", 35);
//es.register("KC002", "SCIENCE", 100);

package exam_summary;

import java.util.ArrayList;
import java.util.List;

public class ExamSummaryMain1 {

	//ある生徒がある科目を欠席した場合でも、正常に処理が行えるよう改良しました
	public static void main(String[] args) {

		ExamSummary1 es = new ExamSummary1();

		//register始まり
		// 一人目
		es.register("KC001", "MATH", 90);
		es.register("KC001", "SCIENCE", 75);
		es.register("KC001", "ENGLISH", 80);

		// 二人目
		es.register("KC002", "MATH", 95);
		es.register("KC002", "SCIENCE", 65);
		es.register("KC002", "ENGLISH", 70);

		// 三人目
		es.register("KC003", "MATH", 70);
		es.register("KC003", "SCIENCE", 80);
		es.register("KC003", "ENGLISH", 80);

		// 四人目
		es.register("KC004", "MATH", 95);
		es.register("KC004", "SCIENCE", 65);
		es.register("KC004", "ENGLISH", 70);

		// 五人目
		es.register("KC005", "MATH", 90);
		es.register("KC005", "SCIENCE", 90);
		es.register("KC005", "ENGLISH", 75);

		// 六人目
		es.register("KC006", "MATH", 80);
		es.register("KC006", "SCIENCE", 90);
		es.register("KC006", "ENGLISH", 90);
		//register終わり

		//getScore始まり
		String student = "KC002";
		List<String> subList = new ArrayList<String>();
		subList.add("MATH");
		subList.add("SCIENCE");
		subList.add("ENGLISH");
		Integer score = Integer.valueOf(es.getScore(student, subList.get(0)));

		System.out.println("学籍番号" + student + "番の" + subList.get(0) + "の点数は" + score + "点です");
		//getScore終わり

		//getTopScoreIdsBySubject始まり
		List<String> l = es.getTopScoreIdsBySubject(subList.get(0));
		List<String> l1 = es.getTopScoreIdsBySubject(subList.get(1));
		List<String> l2 = es.getTopScoreIdsBySubject(subList.get(2));

		System.out.println(subList.get(0) + "の得点が最も高かったメンバーは" + l + "です。");
		System.out.println(subList.get(1) + "の得点が最も高かったメンバーは" + l1 + "です。");
		System.out.println(subList.get(2) + "の得点が最も高かったメンバーは" + l2 + "です。");
		//getTopScoreIdsBySubject終わり

		//getIdsByAverage始まり
		List<String> noAvgList = es.getIdsByAverage();

		System.out.println("平均点が高い順に学籍番号を表示します。" + noAvgList);
		//getIdsByAverage終わり
	}
}
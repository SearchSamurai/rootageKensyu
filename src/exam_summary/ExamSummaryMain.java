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

import java.util.List;

public class ExamSummaryMain {

//	ExamSummary1とExamSummaryMain1が完成形なのでそちらを参照ください。
//	こちらは学籍番号課題出題時の提出版で、"ある科目を欠席した生徒がいた場合"
//	を想定した処理ができていません。n人が3科目受けた前提で処理をしています。
	public static void main(String[] args) {

		ExamSummary es = new ExamSummary();
		//register始まり
		// 一人目
		es.register("KC001", "MATH", 90);
		es.register("KC001", "SCIENCE", 90);
		es.register("KC001", "ENGLISH", 100);
		// 二人目
		es.register("KC002", "MATH", 95);
		es.register("KC002", "SCIENCE", 100);
		es.register("KC002", "ENGLISH", 70);
		// 三人目
		es.register("KC003", "MATH", 70);
		es.register("KC003", "SCIENCE", 100);
		es.register("KC003", "ENGLISH", 55);
		// 四人目
		es.register("KC004", "MATH", 95);
		es.register("KC004", "SCIENCE", 65);
		es.register("KC004", "ENGLISH", 90);
		// 五人目
		es.register("KC005", "MATH", 90);
		es.register("KC005", "SCIENCE", 90);
		es.register("KC005", "ENGLISH", 100);
		// 六人目
		es.register("KC006", "MATH", 80);
		es.register("KC006", "SCIENCE", 90);
		es.register("KC006", "ENGLISH", 100);
		//register終わり

		//getScore始まり
		Integer score = Integer.valueOf(es.getScore("KC002", "ENGLISH"));
		System.out.println(score + "点");
		//getScore終わり

		//getTopScoreIdsBySubject始まり
		List<String> l = es.getTopScoreIdsBySubject("MATH");
		List<String> l1 = es.getTopScoreIdsBySubject("SCIENCE");
		List<String> l2 = es.getTopScoreIdsBySubject("ENGLISH");
		System.out.println("数学の得点が最も高かったメンバーは" + l + "です。");
		System.out.println("科学の得点が最も高かったメンバーは" + l1 + "です。");
		System.out.println("英語の得点が最も高かったメンバーは" + l2 + "です。");
		//getTopScoreIdsBySubject終わり

		//getIdsByAverage始まり
		List<String> avg = es.getIdsByAverage();
		System.out.println("平均点が高い順に学籍番号を表示します。" + avg);
		//getIdsByAverage終わり
	}
}
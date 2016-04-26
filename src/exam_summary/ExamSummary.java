//事前準備1. ExamSummary クラスを作成する
//publicメソッドは、下記を参考に4つ作成すること。
//引数名は日本語で記述されているが、実装時に適切な命名を行うこと。(後からリファクタリングで変更も可能)

package exam_summary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamSummary {

	//学籍番号登録リスト
	List<String> noList = new ArrayList<String>();

	//科目登録リスト
	List<String> subList = new ArrayList<String>();

	//点数登録リスト
	List<Integer> scoList = new ArrayList<Integer>();

	/**
	 * 学籍番号、科目、得点を登録する。
	 */
	public void register(String no, String subject, int score) {

		//引数で渡された値を各リストへ登録
		noList.add(no);
		subList.add(subject);
		scoList.add(Integer.valueOf(score));
	}
	/**
	 * 引数で指定された学籍番号・科目の得点を返す。
	 */
	public int getScore(String no, String subject) {

		//引数で指定された学籍番号・科目の得点格納用リスト(戻り値)
		int reScore = 0;

		//登録時、単に別々のリストにaddしているだけで、データ同士の関連性はないので、if文で紐付けしている。
		//学籍番号と科目が、それぞれ引数で渡されたものと一致した場合、そのi番目の得点が、
		//引数で指定された学籍番号・科目の得点ということになるので、その値を返している。
		for(int i = 0; i < noList.size(); i++)
			if((noList.get(i).equals(no)) && subList.get(i).equals(subject)){
				reScore = scoList.get(i).intValue();
			}
		return reScore;
	}

	/**
	 * 引数で指定された科目の最高得点の学籍番号のリストを返す
	 */
	public List<String> getTopScoreIdsBySubject(String subject) {

		//各人の、引数で渡された科目の得点のみを一旦格納するリスト
		List<Integer> oneSubScoList = new ArrayList<Integer>();

		//引数で指定された科目の最高得点の学籍番号格納用リスト(戻り値)
		List<String> l = new ArrayList<String>();

		//科目のみを格納したリストと、引数で渡された科目を比較し、一致した場合に
		//oneSubScoListにaddする。
		for(int i = 0; i < subList.size(); i++){
			if(subList.get(i).equals(subject)){
				oneSubScoList.add(scoList.get(i));
			}
		}

		//最高得点ソート用に、一時的に得点を格納する変数
		int tmp = oneSubScoList.get(0).intValue();

		//最高得点格納用変数
		int topScore = tmp;

		//引数で渡された科目の、最高得点を算出する処理
		//誰がその点数を取ったかは後に求める
		for(int i = 0; i < oneSubScoList.size() - 1; i++){
			if(topScore < oneSubScoList.get(i+1).intValue()){
				tmp = oneSubScoList.get(i+1).intValue();
				topScore = tmp;
			}
		}

		//1.科目格納リストと、引数で渡された科目を比較
		//2.得点格納リストと、最高得点を比較
		//1と2を満たすi番目の学籍番号を、リストに格納
		//つまりこのリストに、引数で指定された科目の最高得点の学籍番号が格納される
		for(int i = 0; i < noList.size(); i++){
			if(subList.get(i).equals(subject) && scoList.get(i).intValue() == topScore){
				oneSubScoList.add(scoList.get(i));
				l.add(noList.get(i));
			}
		}

		return l;
	}

	/**
	 * 全科目の平均得点の高い順に学籍番号を返す。
	 */
	public List<String> getIdsByAverage() {

		//全科目の平均得点格納用リスト
		List<String> l = new ArrayList<String>();

		//全科目の平均得点が高い順の学籍番号を格納するリスト
		List<String> noList2 = new ArrayList<String>();

		//後のソート処理用に、初期値として学籍番号格納リストの0番目の番号をadd
		noList2.add(noList.get(0));

		//教科数カウント用変数
		int countSub = 0;

		//人数カウント用変数
		int countNo = 0;

		//各人の合計点を算出する繰り返し処理用の変数。
		//例えば、得点格納用リストから、一人目の合計を求める場合、インデックス番号0~2の3科目分が必要である。
		//2人目であれば、インデックス番号3~5となる。その場合、ネストされたfor文の、内側のfor文は、int j=0;
		//としてしまうと、再度繰り返し処理に入った時に、リストのインデックス番号0番から拾ってしまう。
		//そのため、0~2、3~5、6~8・・・と、(今回は3科目なので)受けた科目数の倍数ごとに処理できるよう、
		//無理矢理ではあるが、課題出題時の段階では、発想不足により、このようなややこしい処理となった。
		int addScore = 0;

		//上記addScoreから、何度繰り返しを行うかの回数を格納する変数
		int avgRoop = 0;

		//各人の合計点と平均を一時的に格納する変数
		double sumAvg = 0.0;

		//countSub算出用変数。
		String s = noList.get(0);

		//countNo算出用変数。
		String s1 = subList.get(0);

		//countSub算出処理。学籍番号はそのままリストにaddしているので、同じ学籍番号がいくつあるか？で科目数を判定している。
		for(int i = 0; i < noList.size(); i++){
			if(noList.get(i).equals(s)){
				countSub++; //3
			}
		}

		//countNo算出処理。教科は重複しない前提なので、リストの中にその教科が何回出てくるかで人数をカウントしている。
		for(int i = 0; i < noList.size(); i++){
			if(subList.get(i).equals(s1)){
				countNo++; //6
			}
		}

		//学籍番号を重複なしで格納していく処理。
		for(int i = 0; i < noList.size() - 1; i++){
			if(noList.get(i) != noList.get(i+1)){
				noList2.add(noList.get(i+1));
			}
		}

		//avgRoopの説明は宣言箇所を参照のこと
		avgRoop = avgRoop + countSub;

		//人数分だけ、得点格納リストから平均を算出。
		for(int i = 0; i < countNo; i++){

			for(int j = addScore; j < avgRoop; j++){

				//各人の合計点を格納
				sumAvg = sumAvg + (scoList.get(j).intValue());

				//内側のfor文が終わる直前に、次の繰り返しに備えた処理を行う
				if(avgRoop - 1 == j){

					//次の繰り返しを始める値を設定
					addScore = j + 1;

					//次の繰り返しが終わる条件を判定する値を設定
					avgRoop = avgRoop + countSub;

					//各人の平均点を算出
					sumAvg = sumAvg / countSub;

					//小数点第1位で四捨五入し、String型に変換した上で、リストに格納
					BigDecimal avg = BigDecimal.valueOf(sumAvg);
					l.add(String.valueOf(avg.setScale(1, BigDecimal.ROUND_HALF_UP)));

					//次の人の平均点を格納するために初期化
					sumAvg = 0;

					//次の人の平均点を算出するために、内側の繰り返しを抜ける
					break;

				}
			}
		}

		System.out.println("四捨五入した平均点を学籍番号順に表示します" + l);

		//各人の平均点が格納されたリストを比較しながら、学籍番号をソートすることで、全科目の平均得点の高い順に学籍番号が格納される。
		//最後にそのリストを返す。
		for(int i = 0; i < l.size()-1; i++){

			for(int j = i+1; j < l.size(); j++){

				if(Double.valueOf(l.get(j)).doubleValue() > Double.valueOf(l.get(i)).doubleValue()){

					String tmp2 = noList2.get(j);
					noList2.set(j, noList2.get(i));
					noList2.set(i, tmp2);

				}
			}
		}

		return noList2;
	}
}
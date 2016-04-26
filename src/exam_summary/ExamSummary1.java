//事前準備1. ExamSummary クラスを作成する
//publicメソッドは、下記を参考に4つ作成すること。
//引数名は日本語で記述されているが、実装時に適切な命名を行うこと。(後からリファクタリングで変更も可能)

package exam_summary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamSummary1 {

	//学籍番号重複予防用カウント変数
	int count = 0;

	//学籍番号を重複しないように登録するリスト
	List<String> noList = new ArrayList<String>();

	//学籍番号登録リスト
	List<String> allNoList = new ArrayList<String>();

	//科目登録リスト
	List<String> subList = new ArrayList<String>();

	//点数登録リスト
	List<Integer> scoList = new ArrayList<Integer>();

	/**
	 * 学籍番号、科目、得点を登録する。
	 */
	public void register(String no, String subject, int score) {

		//最初(リストのサイズが0の時)は必ず追加。
		//また、リストに格納されている学籍番号と、引数で渡された学籍番号が一致しなかった場合は追加。
		if(noList.size() == 0 || !(noList.get(count).equals(no))){
			noList.add(no);
			if(noList.size() > 1){
				count++;
			}
		}

		//引数で渡された値を各リストへ登録
		allNoList.add(no);
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
		for(int i = 0; i < allNoList.size(); i++)
			if((allNoList.get(i).equals(no)) && subList.get(i).equals(subject)){
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
		for(int i = 0; i < allNoList.size(); i++){
			if(subList.get(i).equals(subject) && scoList.get(i).intValue() == topScore){
				oneSubScoList.add(scoList.get(i));
				l.add(allNoList.get(i));
			}
		}

		return l;
	}

	/**
	 * 全科目の平均得点の高い順に学籍番号を返す。
	 */
	public List<String> getIdsByAverage() {

		//各人の合計点を格納する変数。後に、各人の受験科目数で割った平均を算出してリストにaddする
		//"学籍番号" "科目" "得点"をセットで登録していることから、
		//必ず最初に登録されている人は1科目受けているので、得点リストの最初に格納されている得点で初期化している。
		int countSco = scoList.get(0).intValue();

		//各人の受験科目数を格納する変数。後にリストにaddする
		//"学籍番号" "科目" "得点"をセットで登録していることから、
		//必ず最初に登録されている人は1科目受けているので、1で初期化している。
		int countNo = 1;

		//学籍番号ソート用に一時的に格納する変数
		String tmp;

		//各人の受験科目数格納用リスト
		List<BigDecimal> countNoList = new ArrayList<BigDecimal>();

		//各人の平均点格納用リスト
		List<BigDecimal> sumAvgList = new ArrayList<BigDecimal>();

		for(int i = 0; i < allNoList.size()-1; i++){

			//最後の繰り返し処理時に~
			if(i == allNoList.size()-2){

				//登録されている最後の人の得点と科目数の合計を算出
				countSco += scoList.get(i+1).intValue();
				countNo += 1;

				//上の2つをそれぞれのリストへ格納
				sumAvgList.add(BigDecimal.valueOf(countSco));
				countNoList.add(BigDecimal.valueOf(countNo));

				//iとi+1番目が同じ学籍番号かで判定し、各人の合計点と受験科目数を算出
			} else if(allNoList.get(i).equals(allNoList.get(i+1))){

				countSco += scoList.get(i+1).intValue();
				countNo += 1;

				//次の人に移った場合、その前の人の合計点と受験科目数を、それぞれのリストへ格納
				//得点の合計と受験科目数を、次の人の処理に合わせて再代入する。
			} else {

				sumAvgList.add(BigDecimal.valueOf(countSco));
				countSco = scoList.get(i+1).intValue();

				countNoList.add(BigDecimal.valueOf(countNo));
				countNo=1;

			}
		}

		//結果の整合性が確認しやすいよう、念のため出力している
		System.out.println("学籍番号順に受験科目数を表示します。" + countNoList);
		System.out.println("学籍番号順に合計点を表示します。" + sumAvgList);

		//各人の合計を、各人の受験科目数で割る。その値を小数点第2位で四捨五入し、リストにセットし直す。
		for (int i = 0; i < countNoList.size(); i++){

			sumAvgList.set(i, sumAvgList.get(i).divide(countNoList.get(i) , 2, BigDecimal.ROUND_HALF_UP));

		}

		//結果の整合性が確認しやすいよう、念のため出力している
		System.out.println("学籍番号順に平均点を表示します。" + sumAvgList);

		//各人の平均点を比較しながら、学籍番号をソートすることで、全科目の平均得点の高い順に学籍番号がソートされる。
		//最後にそのリストを返す
		for(int i = 0; i < sumAvgList.size()-1; i++){

			for(int j = i+1; j < sumAvgList.size(); j++){

				if(sumAvgList.get(j).compareTo(sumAvgList.get(i)) > 0){

					tmp = noList.get(j);
					noList.set(j, noList.get(i));
					noList.set(i, tmp);

				}
			}
		}

		return noList;

	}
}
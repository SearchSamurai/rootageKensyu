//事前準備1. ExamSummary クラスを作成する
//publicメソッドは、下記を参考に4つ作成すること。
//引数名は日本語で記述されているが、実装時に適切な命名を行うこと。(後からリファクタリングで変更も可能)

package exam_summary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamSummary {
    List<String> noList = new ArrayList<String>();
    List<String> subList = new ArrayList<String>();
    List<Integer> scoList = new ArrayList<Integer>();
	/**
	 * 学籍番号、科目、得点を登録する。
	 */
	public void register(String no, String subject, int score) {

	    noList.add(no);
	    subList.add(subject);
	    scoList.add(Integer.valueOf(score));
	}
	/**
	 * 引数で指定された学籍番号・科目の得点を返す。
	 */
	public int getScore(String no, String subject) {
		int reScore = 0;
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
	    List<Integer> oneSubScoList = new ArrayList<Integer>();
		List<String> l = new ArrayList<String>();
		for(int i = 0; i < subList.size(); i++){
			if(subList.get(i).equals(subject)){
				oneSubScoList.add(scoList.get(i));
			}
		}

		int tmp = oneSubScoList.get(0).intValue();
		int topScore = tmp;
		for(int i = 0; i < oneSubScoList.size() - 1; i++){
			if(topScore < oneSubScoList.get(i+1).intValue()){
				tmp = oneSubScoList.get(i+1).intValue();
				topScore = tmp;
			}
		}

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
		List<String> l = new ArrayList<String>();
        List<String> noList2 = new ArrayList<String>();

        noList2.add(noList.get(0));
		int countSub = 0;
		int countNo = 0;
		int addScore = 0;
		int avgRoop = 0;
		double avg_0 = 0.0;
		String s = noList.get(0);
		String s1 = subList.get(0);

		for(int i = 0; i < noList.size(); i++){
			if(noList.get(i).equals(s)){
				countSub++; //3
			}
		}

		for(int i = 0; i < noList.size(); i++){
			if(subList.get(i).equals(s1)){
				countNo++; //6
			}
		}

		for(int i = 0; i < noList.size() - 1; i++){
			if(noList.get(i) != noList.get(i+1)){
				noList2.add(noList.get(i+1));
			}
		}

		avgRoop = avgRoop + countSub;
		for(int i = 0; i < countNo; i++){
			for(int j = addScore; j < avgRoop; j++){
				avg_0 = avg_0 + (scoList.get(j).intValue());
				if(avgRoop - 1 == j){
					addScore = j + 1;
					avgRoop = avgRoop + countSub;
					avg_0 = avg_0 / countSub;
					BigDecimal avg = BigDecimal.valueOf(avg_0);
					l.add(String.valueOf(avg.setScale(1, BigDecimal.ROUND_HALF_UP)));
					avg_0 = 0;
					break;
				}
			}
		}

		System.out.println("四捨五入した平均点を学籍番号順に表示します" + l);

		for(int i = 0; i < l.size()-1; i++){
			for(int j = i+1; j < l.size(); j++){
				if(Double.valueOf(l.get(j)).doubleValue() > Double.valueOf(l.get(i)).doubleValue()){
					double tmp = Double.valueOf(l.get(j)).doubleValue();
					l.set(j, l.get(i));
					l.set(i, String.valueOf(tmp));

					String tmp2 = noList2.get(j);
					noList2.set(j, noList2.get(i));
					noList2.set(i, tmp2);
				}
			}
		}
		return noList2;
	}
}
package kensyu_matome;
import java.util.List;


public class MatomeExampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "あaいうbcえ";

		MatomeExample m = new MatomeExample();

		//int型は3以上
		List<String> l = m.getDivideString(str , 4);

		for(int i = 0; i < l.size(); i++){

			System.out.println(l.get(i));

		}

	}

}

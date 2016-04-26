package matome;
import java.util.List;


public class MatomeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "あaいうbcえ";

		Matome m = new Matome();

		//int型は3以上
		List<String> l = m.byteSeparate(4 , str);

		for(int i = 0; i < l.size(); i++){

			System.out.println(l.get(i));

		}

	}

}

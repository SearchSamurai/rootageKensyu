package matome;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Matome {

	//バイト数ごとに区切って渡す
	public List<String> byteSeparate(int a , String s){

		List<String> l = new ArrayList<String>();
		String tmp = s;
		String tmp1 = null;
		int countByte = 0;
		int length = s.length();

		for(int i = 0; i < length; i++){

			try {

				countByte = tmp.substring(0,i).getBytes("MS932").length;

				if(countByte == a || countByte == a-1){
					tmp1 = tmp.substring(0,i);
					l.add(tmp1);
					tmp = tmp.replace(tmp1 , "");
					i=0;
					length = tmp.length();
				}

			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

		}

		tmp = tmp.replace(tmp1 , "");
		l.add(tmp);

		return l;
	}
}

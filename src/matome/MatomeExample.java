package matome;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MatomeExample {


    private static final String SHIFT_JIS = "MS932";

    public List<String> getDivideString(String sOriginal, int iDevideLength) {

        List<String> result = new ArrayList<String>();
        StringBuilder record = new StringBuilder();
        int bufLen = 0;

        for(int i = 0; i < sOriginal.length(); i++) {

            byte[] bytes = null;

            try {

                bytes = sOriginal.substring(i, i + 1).getBytes(SHIFT_JIS);

                if(bytes == null) {
                    continue;
                }

                if(bufLen + bytes.length > iDevideLength) {
                    result.add(record.toString());
                    record = new StringBuilder();
                    bufLen = 0;
                }

                record.append(sOriginal.substring(i, i + 1));
                bufLen = bufLen + bytes.length;

            } catch(UnsupportedEncodingException ex) {
                // エンコード失敗した文字は無視
            }
        }

        if(record.length() != 0) {
            result.add(record.toString());
        }

        return result;
    }

}

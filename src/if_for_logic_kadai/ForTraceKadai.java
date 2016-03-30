package if_for_logic_kadai;
/**
 * For文のトレース課題.
 * 
 * <pre>
 * まずトレースを実施し、その後実行結果を確認する。
 * </pre>
 */
public class ForTraceKadai {
    public static void main(String[] args) {
        System.out.println("for文を始めます");

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }

            if (i++ > 3) {
                continue;
            }

            if (i >= 6) {
                break;
            }
            System.out.println("現在のiは" + i);
        }

        System.out.println("for文が終わりました");
    }

}
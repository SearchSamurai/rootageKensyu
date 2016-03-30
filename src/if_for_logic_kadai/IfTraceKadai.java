package if_for_logic_kadai;
/**
 * if文のトレース課題.
 * 
 * <pre>
 * まずトレースを実施し、その後実行結果を確認する。
 * </pre>
 */
public class IfTraceKadai {
    public static void main(String[] args) {
        System.out.println("start");
        int age = 50;
        if (age == 0) {
            System.out.println("0才");
        } else if (age >= 10) {
            System.out.println("10才以上");
        } else if (age >= 20) {
            System.out.println("20才以上");
        } else if (age >= 30) {
            System.out.println("30才以上");
        }
        System.out.println("end");
    }
}
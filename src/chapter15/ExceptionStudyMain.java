package chapter15;

import java.io.IOException;

/**
 * 例外処理実践メイン.
 *
 * @author masaki.gunji
 */
public class ExceptionStudyMain {

    public static void main (String[] args) throws IOException {
        System.out.println("main start");

        ExceptionStudyLogic logic = new ExceptionStudyLogic();
        logic.sub();

        System.out.println("main end");
    }
}

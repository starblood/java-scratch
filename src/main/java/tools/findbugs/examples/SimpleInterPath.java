package tools.findbugs.examples;

import java.util.Random;

/**
 * Created by starblood on 2014. 6. 30..
 * 조건에 따라서 inter-procedural 하게 함수들이 호출시, Null dereference가 발생하는 경우
 */
public class SimpleInterPath {
    int rnd = new Random().nextInt();

    void argLt10Bug(int x) {
        String s = null;
        if (x > 10) s.toString();
    }

    void trig() {
        if (rnd < 5) argLt10Bug(rnd);
    }
}

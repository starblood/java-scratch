package tools.findbugs.examples;

/**
 * Created by starblood on 2014. 6. 30..
 * Null 값이 여러 함수에 걸쳐 함수의 return 값으로 전달 되는 경우
 */
public class RetInter {

    String ret3() {
        String x = null;
        String y = "asdf";
        return x;
    }

    String ret2() {
        return ret3();
    }

    String ret1() {
        return ret2();
    }

    void trig() {
        String x = ret1();
        String y = "zxcv";
        x.toString(); /* BUG */
    }

}

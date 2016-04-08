package tools.findbugs.examples;

/**
 * Created by starblood on 2014. 6. 30..
 * Null 값이 여러 함수에 걸쳐 함수의 인자로 전달 되는 경우
 */
public class ArgInter {
    void arg3(String x) {
        x.toString();
    }
    void arg2(String x) {
        arg3(x);
    }
    void arg1(String x) {
        arg2(x);
    }
    void trig() {
        String x = null;
        arg1(x); /* BUG */
    }
}

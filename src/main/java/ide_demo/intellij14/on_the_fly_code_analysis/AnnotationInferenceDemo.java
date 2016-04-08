package ide_demo.intellij14.on_the_fly_code_analysis;


import lib.StringLib;
import org.apache.commons.lang3.StringUtils;

/**
 * IntelliJ 14 demo
 *
 * Created by john.shim on 14. 11. 26..
 * refer to
 * http://blog.jetbrains.com/idea/2014/10/automatic-notnullnullablecontract-inference-in-intellij-idea-14/
 */
public class AnnotationInferenceDemo {
    public static void main(String[] args) {
        // null 을 넣어도 되는 경우
        StringUtils.abbreviate(null, 10);

        // null 을 넣으면 안되는 경우
        String str = String.valueOf(null);

        // null constraint 를 사용

        String str2 = StringLib.plusA("abc");
    }
}

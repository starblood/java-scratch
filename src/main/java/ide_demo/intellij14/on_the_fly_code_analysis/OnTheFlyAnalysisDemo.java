package ide_demo.intellij14.on_the_fly_code_analysis;

/**
 * Created by john.shim on 14. 12. 2..
 */
public class OnTheFlyAnalysisDemo {
    public void method1() {}
    public void method2() {}

    // On-the-fly Analysis
    public void test(String line, String name) {
        if (line == null) {
            return;
        }

        method1();
        method2();

        // moving cursor to '==' invokes IntelliJ on the fly code analysis result
        if (line == null) {

        }
    }

    // Intentions & Quick-Fixes
    public void test2(String line, String name) {
        if (line == null && name == null) {
            return;
        }

        method1();
        method2();

        // IntelliJ found code inconsistency and suggests best quick-fixes for 'line.equals("abc")'
        // type opttion + enter
        if (line.equals("abc") && name.equals("john")) {
            System.out.println("hello");
        }

        if (line != null) {

        }
    }
}

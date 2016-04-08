package tools.findbugs.examples;

import java.util.Random;

/**
 * Created by starblood on 2014. 6. 30..
 * 가장 간단한 Null dereference 오류
 */
public class SimpleIntra {
    int rnd = new Random().nextInt();
    void basic() {
        String x = null;
        x.toString(); /* BUG */
    }
    void ifTrueBranch() {
        String x = null;
        String y = null;
        if(rnd > 10) x.toString(); /* BUG */
    }
    void ifFalseBranch() {
        String x = null;
        String y = null;
        if(rnd > 10) x = "asdf";
        else y.toString(); /* BUG */
    }
    void reassignment() {
        String x = null;
        String y = "asdf";
        x = "asdf";
        x.toString();
    }
    void reassignmentWithBranch() {
        String x = null;
        String y = "asdf";
        if(rnd > 10) x = "asdf";
        x.toString(); /* BUG */
    }
}

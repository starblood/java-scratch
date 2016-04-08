package ide_demo.intellij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by starblood on 2014. 5. 30..
 */
public class GrepConsoleTest {
    private static Logger logger = LoggerFactory.getLogger(GrepConsoleTest.class);
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                logger.warn("fun");
            } else if (i % 4 == 0) {
                logger.error("not fun");
            } else {
                logger.info("interesting.");
            }
        }
    }
}

package lang.java67;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by starblood on 2014. 3. 11..
 */
public class GrammarFeatureTest {
    public void test_diamond_operator() {
        // in Java 6 style
        Map<String, List<Integer>> map1 = new TreeMap<String, List<Integer>>();

        // in Java 7 style
        Map<String, List<Integer>> map2 = new TreeMap<>();
    }

    public int getMonth(String value) {
        int month;
        switch (value) {
            case "Jan":
                month = 1;
                break;
            case "Feb":
                month = 2;
                break;
            // ...
            default:
                month = 12;
                break;
        }
        System.out.println("Jan".hashCode());
        return month;
    }

    public void java6_try() {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream("movies.txt");
            dos = new DataOutputStream(fos);
            dos.writeUTF("Java 6 makes me tired!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if (dos != null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void java7_try() {
        try (
                FileOutputStream fos  = new FileOutputStream("movies.txt");
                DataOutputStream dos = new DataOutputStream(fos);)
        {
            dos.writeUTF("Java 7 Block Buster");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void test_numeric_literals_with_underscores() {
        int thousand = 1_000;
        int million = 1_000_000;
        float pi = 	3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
    }

    public void methodThatThrowsThreeExceptions () throws IOException, NumberFormatException {

    }

    public void test_multiple_exception_catch() {
        try {
            methodThatThrowsThreeExceptions();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        GrammarFeatureTest test = new GrammarFeatureTest();
        test.getMonth("Dec");
    }
}

package ide_demo.intellij;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by starblood on 2014. 5. 30..
 */
public class ThirdPartyLibraryDebug {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }


        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf(i + " : " + array[i]);
        }
    }
}

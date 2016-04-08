package ide_demo.intellij14.debugger;

import java.util.Random;

/**
 * Created by john.shim on 14. 11. 29..
 */
public class ShowVariablesInEditor {
    public static int getRandomInt() {
        return (new Random(10)).nextInt();
    }

    public static int [] getRandomIntArray() {
        int size = 20;
        int[] randArr = new int[size];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = getRandomInt();
        }
        return randArr;
    }

    public static void main(String[] args) {
        int [] arr = getRandomIntArray();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int someInt = getRandomInt();
            int multipliedVal = val * someInt;

            if (multipliedVal < 10) {
                System.out.println("hello");
            }
        }
    }
}

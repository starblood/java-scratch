package ide_demo.intellij;


import java.util.Random;

/**
 * Created by starblood on 2014. 5. 30..
 */
public class ChrononDemo {
    public static final int SIZE = 1000;


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        final int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println(array[i]);
        }
    }
}

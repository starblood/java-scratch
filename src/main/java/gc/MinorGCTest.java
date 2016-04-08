package gc;

import java.util.ArrayList;

/**
 * Created by starblood on 2014. 3. 4..
 *
 * Minor GC example code
 */
public class MinorGCTest {
    private void makeObjects() {
        Integer [] intArr = new Integer[1024000]; // 1024 k-bytes
        ArrayList<Integer> list = new ArrayList<Integer>(1024000);
        for (int i = 0; i < 1024; i++) {
            intArr[i] = i;
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MinorGCTest maker = new MinorGCTest();
        long count = 1;
        while (true) {
            maker.makeObjects();
            Thread.sleep(1000);
            System.out.print(".");
            if (count % 100 == 0) {
                System.out.println("");
            }
            ++count;
        }
    }
}

package fpij.fi;

/**
 * Created by starblood on 2014. 4. 23..
 */
public class WorkerTester {
    public static void execute(Worker worker) {
        worker.doSomeWork();
    }
    public static void main(String[] args) {
        execute(new Worker() {
            @Override
            public void doSomeWork() {
                System.out.printf("do some heavy work");
            }
        });

        execute(() -> System.out.printf("do some work by lambda"));
    }
}

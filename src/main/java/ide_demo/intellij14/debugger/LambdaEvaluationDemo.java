package ide_demo.intellij14.debugger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by john.shim on 14. 12. 2..
 */
public class LambdaEvaluationDemo {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(100, 20, 3, 2000, 39, 51, 40, 26, 10009, 1223);

        List<String> priceList = prices.stream().filter(price -> price > 500).map(price -> price + " WON").
                collect(Collectors.toList());
        priceList.forEach(System.out::println);
    }
}

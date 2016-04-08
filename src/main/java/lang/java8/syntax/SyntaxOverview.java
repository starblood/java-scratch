package lang.java8.syntax;

import java.util.function.Predicate;

/**
 * User: starblood
 * Date: 2014. 4. 21.
 * Time: 오전 9:50
 */
public class SyntaxOverview {



    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }


    public static void main(String[] args) {
        checkIfStartsWith("abc");
    }
}

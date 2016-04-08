package lang.java8.collection;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by starblood on 2014. 4. 10..
 */

public class PickElement {
    public static void main(String[] args) {
        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> (String input) -> input.startsWith(letter);

        final long countFriendsStartN = Folks.friends.stream().filter(checkIfStartsWith("N")).count();
        System.out.println(countFriendsStartN);

        final long countFriendsStartN2 = Folks.friends.stream().filter(startsWithLetter.apply("N")).count();
        System.out.println(countFriendsStartN2);
    }

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }
}

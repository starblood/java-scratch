package lang.java8.collection;

/**
 * User: starblood
 * Date: 2014. 4. 11.
 * Time: 오전 9:38
 */

public class PickALongest {
    public static void main(String[] args) {
        System.out.println(Folks.friends.stream().mapToInt(name -> name.length()).sum());

        Folks.friends.stream().reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    }
}

package lang.string_pool;

/**
 * User: starblood
 * Date: 2014. 2. 16.
 * Time: 오후 6:53
 */
public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        String str3 = new String("Cat");

        String str4 = "C" + "at"; // Cat
        String str5 = "C";
        String str6 = "at";

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == (str5+str6)); // false
    }
}

package lang.string_pool;

import java.lang.reflect.Field;

/**
 * Created by starblood on 2014. 3. 10..
 */
public class StringImmutabilityTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = str1.substring(6, str1.length());
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        Field field = String.class.getDeclaredField("value"); // using reflection
        field.setAccessible(true); // set field can be modified

        char [] value = (char []) field.get(str1);
        value[6] = 'J';
        value[7] = 'A';
        value[8] = 'V';
        value[9] = 'A';
        value[10] = '!';

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

package lib;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by john.shim on 14. 11. 27..
 */
public class StringLib {


    public static String plusA(@NotNull String str) {
        return str + "A";
    }

    public static boolean isEmpty(@Null String str) {
        if (str == null) {
            return true;
        } else {
            if (str.length() == 0) {
                return true;
            }
        }
        return false;
    }
}

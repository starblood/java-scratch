package ide_demo.intellij14.code_completion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by john.shim on 14. 12. 1..
 */
public class InjectedCodeCompletionDemo {
    public void test(Connection connection) throws SQLException {
        PreparedStatement pstmt;
        // injected code completion
        pstmt = connection.prepareCall("SELECT adminid FROM ADMIN_LOG WHERE service = ?");
        pstmt.setString(1, "video");
    }

    public static void main(String[] args) {

    }
}

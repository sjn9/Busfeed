package View;
import java.sql.Connection;
import mycon.Myconn;
public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        connection=Myconn.getConnection();
    }
}
package dao;
import java.sql.*;
import mycon.Myconn;
public class AdminDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertAdmin (Admin admin) throws Exception {
        sql = "insert into admin values (?,?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, admin.name);
        preparedStatement.setString(2, admin.designation);
        preparedStatement.setString(3, admin.password);
        preparedStatement.setInt(4, admin.mobile);
        return preparedStatement.executeUpdate() > 0;
    }
}
package dao;
import java.sql.*;
import mycon.Myconn;
public class NewUserDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertNewUser (NewUser newUser) throws Exception {
        sql = "insert into user values (?,?,?,?,?,?,?,?,?,?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, newUser.name);
        preparedStatement.setString(2, newUser.email);
        preparedStatement.setString(4, newUser.enrollmentid);
        preparedStatement.setString(5, newUser.branch);
        preparedStatement.setString(9, newUser.address);
        preparedStatement.setString(10, newUser.bloodgroup);
        preparedStatement.setString(11, newUser.stopname);
        preparedStatement.setString(12, newUser.password);
        preparedStatement.setString(3, newUser.mobile);
        preparedStatement.setString(6, newUser.year);
        preparedStatement.setString(7, newUser.semester);
        preparedStatement.setString(8, newUser.shift);
        return preparedStatement.executeUpdate() > 0;
    }
}
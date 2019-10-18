package dao;
import java.sql.*;
import mycon.Myconn;
public class StopDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertStop (Stop stop) throws Exception {
        sql = "insert into stop values (?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, stop.stopname);
        preparedStatement.setInt(2, stop.capacity);
        preparedStatement.setInt(3, stop.routeno);
        return preparedStatement.executeUpdate() > 0;
    }
}
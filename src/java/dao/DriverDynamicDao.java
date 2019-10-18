package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;
public class DriverDynamicDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean driverAssigned (DriverDynamic driverDynamic) throws Exception {
        sql = "insert into driverdynamic values (?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, driverDynamic.drivername);
        preparedStatement.setString(2, driverDynamic.assigned);
        return preparedStatement.executeUpdate() > 0;
    }
}
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import mycon.Myconn;
public class DriverSmsDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public void checkDriverData() throws Exception    
    {
        sql="select d.mobile,d.name ,a.routename,a.busno from driver d,allocate a where a.drivername=d.name;";
        connection=Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            DriverSMS.main(resultSet.getString("mobile"),resultSet.getString("name"),resultSet.getString("busno"),resultSet.getString("routename"));
            
        }
    }        
}
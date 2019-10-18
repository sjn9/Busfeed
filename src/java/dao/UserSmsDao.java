package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import mycon.Myconn;
public class UserSmsDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public void checkUserData(String q) throws Exception    
    {
        sql="select d.name as 'dname',d.mobile as 'dmobile',a.routename,u.mobile,a.busno from driver d,user u,allocate a where u.stopname=a.routename and a.drivername=d.name and u.shift="+q+";";
        System.out.println(q);
        connection=Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            UserSMS.main(resultSet.getString("mobile"),resultSet.getString("routename"),resultSet.getString("busno"),resultSet.getString("dname"),resultSet.getString("dmobile"));
            
        }
    }        
}
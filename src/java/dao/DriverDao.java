package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;
public class DriverDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertDriver (Driver driver) throws Exception {
        sql = "insert into driver values (?,?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, driver.name);
        preparedStatement.setString(3, driver.address);
        preparedStatement.setString(4, driver.driverlicense);
        preparedStatement.setString(2, driver.mobile);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<Driver> searchAll()throws Exception
    {
        sql="select name,mobile,address,driverlicense from driver";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Driver> mylist = new ArrayList<>();
        while (resultSet.next()) {
            Driver F=new Driver();
            F.setName(resultSet.getString(1));
            F.setMobile(resultSet.getString(2));
            F.setDriverlicense(resultSet.getString(4));
            F.setAddress(resultSet.getString(3));
            mylist.add(F);
        }
        return mylist;
    }
    public List<Driver> searchDriver() throws Exception
    {
        sql="select name from driver";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Driver> ylist = new ArrayList<>();
        while (resultSet.next()) {
            Driver A=new Driver();
            A.setName(resultSet.getString(1));
            ylist.add(A);
        }
        return ylist;
    }
     
}
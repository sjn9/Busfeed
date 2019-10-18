package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;

public class AllocateDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertAllocate (Allocate allocate) throws Exception {
        sql = "insert into allocate values (?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, allocate.route);
        preparedStatement.setString(2, allocate.busnumber);
        preparedStatement.setString(3, allocate.driver);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<Allocate> searchAllocate()throws Exception
    {
        sql="select routename, busno, drivername from allocate";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Allocate> ylist = new ArrayList<>();
        while (resultSet.next()) {
            Allocate A=new Allocate();
            A.setRoute(resultSet.getString(1));
            A.setBusnumber(resultSet.getString(2));
            A.setDriver(resultSet.getString(3));
            ylist.add(A);
        }
        return ylist;
    }
    public void deleteAllocate()throws Exception
    {
        sql="delete from allocate";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        int i=preparedStatement.executeUpdate();
        System.out.println(i);
    }
}

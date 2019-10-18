package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;
public class BusDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertBus (Bus bus) throws Exception {
        sql = "insert into bus values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, bus.registration);
        preparedStatement.setString(2, bus.permitdate);
        preparedStatement.setString(3, bus.insurancedate);
        preparedStatement.setString(4, bus.gps);
        preparedStatement.setString(5, bus.camera);
        preparedStatement.setString(6, bus.firstaid);
        preparedStatement.setString(7, bus.toolkit);
        preparedStatement.setString(8, bus.speedgovernor);
        preparedStatement.setString(9, bus.conductor);
        preparedStatement.setString(10, bus.lastfitnesstestdate);
        preparedStatement.setString(11, bus.fitnesstestduedate);
        preparedStatement.setString(12, bus.busno);
        preparedStatement.setString(13, bus.capacity);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<Bus> searchBus() throws Exception
    {
        sql="select busno, capacity from bus";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Bus> ylist = new ArrayList<>();
        while (resultSet.next()) {
            Bus A=new Bus();
            A.setBusno(resultSet.getString(1));
            A.setCapacity(resultSet.getString(2));
            ylist.add(A);
        }
        return ylist;
    }
}
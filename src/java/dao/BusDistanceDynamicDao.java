package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;
public class BusDistanceDynamicDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean calculateDistance (BusDistanceDynamic busDistanceDynamic) throws Exception {
        sql = "insert into busdistancedynamic values (?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, busDistanceDynamic.busno);
        preparedStatement.setInt(2, busDistanceDynamic.distancetravelled);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<BusDistanceDynamic> searchDistance() throws Exception
    {
        sql="select busno,distancetravelled from busdistancedynamic";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<BusDistanceDynamic> ylist = new ArrayList<>();
        while (resultSet.next()) {
            BusDistanceDynamic A=new BusDistanceDynamic();
            A.setBusno(resultSet.getString(1));
            A.setDistancetravelled(resultSet.getInt(2));
            ylist.add(A);
        }
        return ylist;
    }
}
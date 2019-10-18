package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;
public class RouteDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertNewUser (Route route) throws Exception {
        sql = "insert into route values (?,?,?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, route.routename);
        preparedStatement.setInt(2, route.distance);
        preparedStatement.setInt(5, route.totalstops);
        preparedStatement.setInt(3, route.capacity);
        preparedStatement.setInt(4, route.routeno);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<Route> searchRoute() throws Exception
    {
        sql="select routeno,distance,capacity,routename,totalstops from route";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Route> ylist = new ArrayList<>();
        while (resultSet.next()) {
            Route A=new Route();
            A.setRoutename(resultSet.getString(4));
            A.setDistance(resultSet.getInt(2));
            A.setTotalstops(resultSet.getInt(5));
            A.setCapacity(resultSet.getInt(3));
            A.setRouteno(resultSet.getInt(1));
            ylist.add(A);
        }
        return ylist;
    }
}
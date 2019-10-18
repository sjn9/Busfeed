package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import mycon.Myconn;
public class FeedbackDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertFeedback (Feedback feedback) throws Exception {
        sql = "insert into feedback values (?,?,?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, feedback.name);
        preparedStatement.setString(2, feedback.email);
        preparedStatement.setString(3, feedback.message);
        return preparedStatement.executeUpdate() > 0;
    }
    public List<Feedback> searchAll()throws Exception
    {
        sql="select * from feedback";
        connection = Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        resultSet=preparedStatement.executeQuery();
        List<Feedback> mylist = new ArrayList<>();
        while (resultSet.next()) {
            Feedback F=new Feedback();
            F.setName(resultSet.getString(1));
            F.setEmail(resultSet.getString(2));
            F.setMessage(resultSet.getString(3));
            mylist.add(F);
        }
        return mylist;
    }
}
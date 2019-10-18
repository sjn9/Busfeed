package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;
public class ForgotPasswordDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean checkUser(String Email,String Mobile) throws Exception    
    {
        sql="select password from user where email=? and mobile=?";
        connection=Myconn.getConnection();
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1, Email);
        preparedStatement.setString(2, Mobile);
        resultSet=preparedStatement.executeQuery();
        if (resultSet.next())
        {
            SMS.main(resultSet.getString("password"), Mobile);
            return true;
        }
        return false;
    }        
}
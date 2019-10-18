package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;

public class LoginDao 
{
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql;
   
    public boolean checkLogin(String email,String password) throws Exception    
    {
    sql="select email,password from user where email=? and password=?";
    con=Myconn.getConnection();
    ps=con.prepareStatement(sql);
    ps.setString(1, email);
    ps.setString(2, password);
    rs=ps.executeQuery();
    return rs.next();  
    }        
}

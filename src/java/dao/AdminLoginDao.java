package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;

public class AdminLoginDao 
{
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql;
   
    public boolean checkAdminLogin(String name,String password) throws Exception    
    {
    sql="select name,password from admin where name=? and password=?";
    con=Myconn.getConnection();
    ps=con.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, password);
    rs=ps.executeQuery();
    return rs.next();  
    }        
}
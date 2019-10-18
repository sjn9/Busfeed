/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycon.Myconn;

/**
 *
 * @author Taher
 */
public class BTDao {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql;
    public boolean insertBT (BT bt) throws Exception {
        sql = "insert into BT values (?)";
        connection = Myconn.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, bt.bbb);
        return preparedStatement.executeUpdate() > 0;
    }
}

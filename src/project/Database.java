/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Database {
    public Connection getConnection()
    {
        Connection c;
        try {
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project_java", "root", "");
            return c;
        } catch (SQLException ex) {
            System.out.println("Ket noi khong thanh cong");
        }
        return null;
    }
}

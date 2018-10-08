/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB.utility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Linhlee
 */
public class ConnectionDB {
    private static final String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=MobileShop";
    private static final String usename = "sa";
    private static final String password ="1";
    
    public static Connection openconnection(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usename, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeconnection(Connection conn,CallableStatement callSt){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(callSt != null){
            try {
                callSt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        Connection conn = ConnectionDB.openconnection();
        if(conn != null){
            System.out.println("ket noi thanh cong");
        }else{
            System.out.println("that bai");
        }
    }
}
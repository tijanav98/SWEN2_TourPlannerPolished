package com.example.tourplanner.DAL.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static Connection conn = null;
    private static DBConnection connInstance;

    public static DBConnection getInstance(){
        if(connInstance == null) {
            connInstance = new DBConnection();
        }
        return connInstance;
    }

    public static Connection getConn() {
        if (conn == null){
            try {
                String url = "jdbc:posgresql://localhost:5432/swen2db";
                String user = "postgres";
                String password = "123456";

                conn = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}

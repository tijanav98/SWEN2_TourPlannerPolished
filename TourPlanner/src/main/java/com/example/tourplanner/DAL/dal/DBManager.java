package com.example.tourplanner.DAL.dal;

import com.example.tourplanner.exception.DataAccessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public enum DBManager {
    INSTANCE;

    public Connection getConnection()
    {
        try {
            String url = "jdbc:posgresql://localhost:5432/swen2db";
            String user = "postgres";
            String password = "123456";

            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (SQLException e) {
            throw new DataAccessException("Database Connection not possible", e);
        }
    }
}

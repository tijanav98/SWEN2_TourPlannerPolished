package com.example.tourplanner.DAL.dal;

import com.example.tourplanner.exception.DataAccessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UnitOfWork implements AutoCloseable {
    private Connection conn;

    public UnitOfWork() {
        this.conn = DBManager.INSTANCE.getConnection();

        try {
        this.conn.setAutoCommit(false);
        } catch(SQLException e) {
        throw new DataAccessException("Can't deactivate autocommit");
        }
    }

    public void commitOperation() {
        if (this.conn != null) {
            try {
                this.conn.commit();
            } catch (SQLException e) {
                throw new DataAccessException("Failed to commit operation",e);
            }
        }
    }

    public void undoOperation() {
        if (this.conn != null) {
            try {
                this.conn.rollback();
            } catch(SQLException e) {
                throw new DataAccessException("Failed to undo operation", e);
            }
        }
    }

    public void closeConnection() {
        if(this.conn != null) {
            try{
                this.conn.close();
                this.conn = null;
            } catch (SQLException e) {
                throw new DataAccessException("Failed to close connection", e);
            }
        }
    }

    public PreparedStatement prepareStatement(String query) {
        if(this.conn != null) {
            try{
                return this.conn.prepareStatement(query);
            } catch (SQLException e) {
                throw new DataAccessException("Failed to create prepared statement");
            }
        } throw new DataAccessException("No active connection available");
    }

    @Override
    public void close() throws Exception {
        this.closeConnection();
    }
}
package br.com.devxlabs.ravin.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=ravin";
    public static final String USER = "postgres";
    public static final String PASS = "postgres";
    
    public static java.sql.Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement) {
        closeConnection(connection);
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
        
    }
    
}

package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

    // Database connection constants
    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String SCHEMA = "projects";
    private static final String USER = "projects";
    private static final String PASSWORD = "projects";

    // JDBC URL format
    private static final String URI = "jdbc:mysql://" + HOST + ":" + PORT + "/" + SCHEMA;

    public static Connection getConnection() {
        try {
            // Obtain a connection using the DriverManager
            Connection connection = DriverManager.getConnection(URI, USER, PASSWORD);

            // Print a message if the connection is successful
            System.out.println("Connected to database: " + SCHEMA);

            return connection;
        } catch (SQLException e) {
            // Print an error message and throw a DbException if connection fails
            System.err.println("Error connecting to database: " + e.getMessage());
            throw new DbException("Error connecting to the database.", e);
        }
    }
}

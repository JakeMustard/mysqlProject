package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

public class ProjectsApp {

    public static void main(String[] args) {
        // Test the database connection
        Connection connection = DbConnection.getConnection();
        
        // Close the connection (optional)
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

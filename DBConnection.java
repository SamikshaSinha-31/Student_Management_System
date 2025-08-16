package studentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_ds";
    private static final String USER = "root"; 
    private static final String PASSWORD = "abc123"; 

    // Force-load the driver class (good practice)
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("⚠️  MySQL JDBC Driver not found. Please add the connector JAR to your classpath.");
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("⚠️  Failed to connect to database. Please check the DB username or password in DBConnection.java");
            return null;
        }
    }
}




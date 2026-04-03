package javacore.lesson10.connection_basic_crud.jdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    private static final String DB_URL = "jdbc:mysql://localhost:3304/db_testing_system";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection isConnectedForTesting() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection to database successfully!");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

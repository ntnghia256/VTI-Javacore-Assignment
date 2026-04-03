package main.javacore.lesson10.connection_basic_crud.jdbcUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

    public static Connection isConnectedForTesting() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resource/database.properties"));

        String DB_URL = properties.getProperty("DB_URL");
        String USER = properties.getProperty("USERNAME");
        String PASS = properties.getProperty("PASSWORD");

        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection to database successfully!");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

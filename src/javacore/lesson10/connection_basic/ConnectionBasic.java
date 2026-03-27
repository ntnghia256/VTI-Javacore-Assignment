package javacore.lesson10.connection_basic;

import java.sql.*;

public class ConnectionBasic {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_testing_system";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        String selectSql = "SELECT position_id, position_name FROM position";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSql)) {

            System.out.println("--- Kết nối thành công ---");

            while (resultSet.next()) {
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");

                System.out.printf("Position ID: %d | Name: %s%n", id, name);
            }

        } catch (SQLException e) {
            System.err.println("Lỗi kết nối hoặc thực thi SQL: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
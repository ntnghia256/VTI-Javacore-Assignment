package main.javacore.lesson10.connection_basic_crud;

import java.sql.*;

public class PositonDAO {
    public void getPositionData(String sql, Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("position_id");
                String name = rs.getString("position_name");

                System.out.printf("Position ID: %d | Name: %s%n", id, name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertPositionData(String sql, Connection connection, String data) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, data);
            preparedStatement.execute();
            System.out.println("Inserted data");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Update name of position
    // Code

    // Delete position
    // Code
}

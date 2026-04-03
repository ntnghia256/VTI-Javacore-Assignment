package javacore.lesson10.connection_basic_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    void deleteEmployeesByIdDepartment(Connection connection, int id) {
        try {
            String sql = "delete from account where account_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            System.out.println("Deleted all employee has id " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

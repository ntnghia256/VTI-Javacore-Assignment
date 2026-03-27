package javacore.lesson10.connection_basic_crud;

import javacore.lesson10.connection_basic_crud.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    // Get all Department
    public List<Department> getDepartments(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from department";
            ResultSet rs = statement.executeQuery(sql);

            List<Department> departments = new ArrayList<>();
            while (rs.next()) {
                Department department = new Department(rs.getString("department_name"));
                departments.add(department);
            }
            return departments;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Get Department by ID
    // Code

    // Check name Department
    public boolean isDepartmentNameExists(Connection connection, String departmentName) {
        try {
            String sql = "select * from department where department_name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return true;
            } return  false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

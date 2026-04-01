package javacore.lesson10.connection_basic_crud;

import javacore.lesson10.connection_basic_crud.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    // Create department
    public void createDepartment(Connection connection, String name) {
        try {
            String sql = "insert into department (department_name) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Get all Department
    public List<Department> getDepartments(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from department";
            ResultSet rs = statement.executeQuery(sql);

            List<Department> departments = new ArrayList<>();
            while (rs.next()) {
                Department department = new Department(rs.getInt("department_id"), rs.getString("department_name"));
                departments.add(department);
            }
            return departments;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Get Department by ID
    // Code

    // Check name Department if exists
    public boolean isDepartmentNameExists(Connection connection, String departmentName) {
        try {
            String sql = "select * from department where department_name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Check id department if exists
    public boolean isDepartmentIdExists(Connection connection, int id) {
        try {
            String sql = "select * from department where department_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Delete department using id
    public void deleteDepartmentUsingProcedure(Connection connection, int id) {
        try {
            String sql = "{CALL sp_delete_department_by_id(?)}";
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1, id);
            callableStatement.execute();
            System.out.println("Delete department successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

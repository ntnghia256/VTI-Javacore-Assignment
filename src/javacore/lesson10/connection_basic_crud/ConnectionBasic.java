package javacore.lesson10.connection_basic_crud;

import javacore.lesson10.connection_basic_crud.entity.Department;
import javacore.lesson10.connection_basic_crud.jdbcUtils.JdbcUtils;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class ConnectionBasic {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Connection connection = JdbcUtils.isConnectedForTesting();

        // PositionDAO & EmployeeDAO
        EmployeeDAO employeeDAO = new EmployeeDAO();
        PositonDAO positonDAO = new PositonDAO();
        // Get position data
        String selectSql = "SELECT position_id, position_name FROM position";
//        positonDAO.getPositionData(selectSql, connection);

        // Insert data
        String insertSql = "insert into position (position_name) values (?)";
//        positonDAO.insertPositionData(insertSql, connection, "Play");

        // DepartmentDAO
        // Create department
        DepartmentDAO departmentDAO = new DepartmentDAO();
//        departmentDAO.createDepartment(connection, "Test");

        List<Department> departmentList = departmentDAO.getDepartments(connection);
        departmentList.forEach(System.out::println);

        // Check name Department
//        System.out.println("Enter the Department name please: ...");
//        String departmentName = sc.nextLine();
//        boolean isExistsDepartment = departmentDAO.isDepartmentNameExists(connection, departmentName);
//        if (isExistsDepartment) {
//            System.out.println("Department already exists");
//        } else  {
//            System.out.println("Department does not exist");
//        }

//        System.out.println("Enter the Department id please: ...");
//        int departmentId = sc.nextInt();
//        boolean isExist = departmentDAO.isDepartmentIdExists(connection, departmentId);
//        if (isExistsDepartment) {
//            System.out.println("Department already exists");
//        } else  {
//            System.out.println("Department does not exist");
//        }

        // Delete department by id
//        System.out.println("Enter the id department need to delete...");
//        int id = sc.nextInt();
//        boolean isExistDepartment = departmentDAO.isDepartmentIdExists(connection, id);
//        if (isExistDepartment) {
//            departmentDAO.deleteDepartmentUsingProcedure(connection, id);
//        } else {
//            throw new Exception("Can not find department which has id: " + id);
//        }

        // Transaction example
        // Delete all employees belong department 3 and delete department 3
//        System.out.println("Enter the id of department: ");
//        int departmentId = sc.nextInt();
//        connection.setAutoCommit(false);
//        try {
//            employeeDAO.deleteEmployeesByIdDepartment(connection, departmentId);
//            departmentDAO.deleteDepartmentUsingProcedure(connection, departmentId);
//            System.out.println("Transaction Commit!");
//        } catch (Exception e) {
//            e.printStackTrace();
//            connection.rollback();
//            System.out.println("Transaction rollback!");
//        }
//        connection.setAutoCommit(true);
    }
}
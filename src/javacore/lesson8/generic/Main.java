package javacore.lesson8.generic;

import javacore.lesson8.generic.datatype_T.GenericStudent;
import javacore.lesson8.generic.element_E.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    // Get and print infomation
    private static <T> void getAndPrint() {
        System.out.println("Enter value please...");
        T data = (T) sc.nextLine();
        System.out.println("Data: " + data);
    }

    private static <T> void getAndPrint(T tData) {
        System.out.println("T-Data is: " + tData);
    }

    // Calculate total
    private static <E extends Number> void calculateTotal(E[] arr) {
        double sum = 0;
        for (E element : arr) {
            sum += element.doubleValue();
        }
        System.out.println("The total is: " + sum);
    }

    public static void main(String[] args) {
        List<GenericStudent> list = new ArrayList<>();
        list.add(new GenericStudent<Integer>(1, "TrongNghia"));
        list.add(new GenericStudent<Float>(1.1f, "Ngu"));
        list.add(new GenericStudent<Double>(3.5, "Khon"));

        System.out.println("List generic student");
        list.forEach(System.out::println);

        // Get and print T data
//        getAndPrint();
        getAndPrint(15);
        getAndPrint(new GenericStudent<>(6.7f, "T-Data"));

        // Demo E generic
        Integer[] intArr = {1, 2, 3};
        Float[] floatArr = {1.1f, 1.2f};
        Long[] longArr = {10L, 20L, 30L};
        Double[] doubleArr = {2.1, 2.2};
        // Total array
        calculateTotal(intArr);
        calculateTotal(floatArr);
        calculateTotal(longArr);
        calculateTotal(doubleArr);

        // Work with employee
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Nghia", new Integer[]{10, 20, 30}));
        employeeList.add(new Employee("Nghia1", new Long[]{10L, 20L, 30L}));
        employeeList.add(new Employee("Nghia2", new Float[]{10.1f, 20f, 30f}));

        System.out.println("----------------");
        employeeList.forEach(em -> {
            System.out.println(em);
            em.printLastSalary();
        });
    }
}

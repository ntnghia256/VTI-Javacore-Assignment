package main.javacore.lesson8.generic.element_E;

import java.util.Arrays;

public class Employee<E> {
    private static int counter = 0;
    private int id;
    private String name;
    private E[] salaries;

    public Employee(String name, E[] salaries) {
        this.id = counter++;
        this.name = name;
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E[] getSalaries() {
        return salaries;
    }

    public void setSalaries(E[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }

    // Get last salary
    public void printLastSalary() {
        if (salaries != null && salaries.length > 0) {
            System.out.println("The last salary: " + salaries[salaries.length - 1]);
        } else {
            System.out.println("The array is empty or null.");
        }
    }
}

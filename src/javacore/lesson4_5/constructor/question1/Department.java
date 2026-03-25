package javacore.lesson4_5.constructor.question1;

public class Department {
    private short id;
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department("Nghia");

        System.out.println(department.id + " - " + department.name);
        System.out.println(department1.id + " - " + department1.name);
    }
}

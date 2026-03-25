package javacore.lesson8_9.collection.list;

public class Student {
    public static int counter = 1;

    private int id;
    private String name;

    public Student(String name) {
        this.name = name;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package main.javacore.lesson8.collection;

public class Student {
    public static int counter = 1;

    private int id;
    private String name;
    private String birthday;
    private float point;

    public Student(String name) {
        this.name = name;
        this.id = counter++;
    }

    public Student(String name, String birthday, float point) {
        this.id = counter++;
        this.name = name;
        this.birthday = birthday;
        this.point = point;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", point=" + point +
                '}';
    }
}

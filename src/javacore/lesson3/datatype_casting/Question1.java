package javacore.lesson3.datatype_casting;

public class Question1 {
    private float salary;

    Question1(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Question1 acc1 = new Question1(5240.5f);
        Question1 acc2 = new Question1(10970.055f);

        int roundAcc1 = (int) acc1.salary;
        int roundAcc2 = (int) acc2.salary;

        System.out.println(roundAcc1);
        System.out.println(roundAcc2);
    }
}

package javacore.lesson8_9.wildcard.entity;

// Question 1
public class Salary<N extends Number> {
    private N amount;

    public Salary(N amount) {
        this.amount = amount;
    }

    // b) Method print salary
    public void printSalary() {
        System.out.println("Current salary: " + amount);
    }
}

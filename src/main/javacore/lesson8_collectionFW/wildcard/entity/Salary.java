package main.javacore.lesson8_collectionFW.wildcard.entity;

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

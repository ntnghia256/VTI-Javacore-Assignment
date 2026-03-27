package javacore.lesson8.wildcard.entity;

// Question 2
public class MyNumber<N extends Number> {
    private N value;

    public MyNumber(N value) {
        this.value = value;
    }
}

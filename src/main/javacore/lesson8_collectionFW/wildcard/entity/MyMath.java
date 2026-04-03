package main.javacore.lesson8_collectionFW.wildcard.entity;

public class MyMath<T extends Number> {

    // Varargs
    public double sum(T... numbers) {
        double total = 0;
        for (T n : numbers) {
            total += n.doubleValue();
        }
        return total;
    }

    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    // (a^b)
    public double power(T a, T b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}

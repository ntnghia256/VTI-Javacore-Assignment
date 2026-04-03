package main.javacore.lesson9.inner_class;

public class CPU {
    private float price;

    public CPU(float price) {
        this.price = price;
    }

    public class Processor {
        int coreAmount;
        String manufacturer;

        public double getCache() {
            return 4.3;
        }
    }

    public class Ram {
        double memory;
        String manufacturer;

        public double getClockSpeed() {
            return 5.5;
        }
    }
}

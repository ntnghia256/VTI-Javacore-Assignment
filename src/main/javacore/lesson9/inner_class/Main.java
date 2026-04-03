package main.javacore.lesson9.inner_class;

public class Main {
    public static void main(String[] args) {
        CPU myCPU = new CPU(500.0f);

        CPU.Processor myProcessor = myCPU.new Processor();
        CPU.Ram myRam = myCPU.new Ram();

        System.out.println("----- CPU Components Specs -----");
        System.out.println("Processor cache: " + myProcessor.getCache());
        System.out.println("Ram Clock Speed: " + myRam.getClockSpeed());

        // Question 2
        Car myCar = new Car("Mazda", "8WD");
        Car.Engine myEngine = myCar.new Engine();
        myEngine.setEngineType("Crysler");

        System.out.println("The car engine is: " + myEngine.getEngineType());
    }
}

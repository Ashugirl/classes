package be.intecbrussel;

public class CarApp {

    public static void main(String[] args) {
        // initialize using constructer
        Car tesla = new Car("Tesla", "Model X", "black");
        System.out.println("Brand is " + tesla.getBrand());
        System.out.println("Model is " + tesla.getModel());
        System.out.println("Color is " + tesla.getColor());

        tesla.accelerate();
        tesla.slowDown();
        tesla.turnLeft();
        tesla.turnRight();

        // initialize without constructor
        Car bmw = new Car();
        bmw.setBrand("Bmw");
        bmw.setModel("M4");
        bmw.setColor("white");
        System.out.println("Brand is " + bmw.getBrand());
        System.out.println("Model is " + bmw.getModel());
        System.out.println("Color is " + bmw.getColor());

        System.out.println("A car has "+ Car.getNumberOfWheels() + " wheels.");

        bmw.accelerate();
        bmw.slowDown();
        bmw.turnLeft();
        bmw.turnRight();
    }

}

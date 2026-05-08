// Abstraction

// Using Abstract Class

abstract class Vehicle
{
    abstract void start();

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car Starts");
    }
}

// Using Interface

interface Animal
{
    abstract void sound(); 
}

class Dog implements Animal
{
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class Pgm5 
{
    public static void main(String[] args) {
        
        Car c = new Car();

        c.start();
        c.stop();

        Dog d = new Dog();

        d.sound();
    }
}
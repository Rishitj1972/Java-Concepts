// Polymorphism

// Method Overloading

class Calculator
{
    int add(int a,int b) {
        return a + b;
    }

    int add(int a,int b, int c) {
        return a + b + c;
    }
}

// Method Overriding

class Animal
{
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Pgm4 {

    public static void main(String[] args) {
        

        Calculator c = new Calculator();

        int r1 = c.add(2,3);
        int r2 = c.add(2,3,4);
        System.out.println("Sum1 = "+r1+" Sum2 = "+r2);

        Animal a = new Animal();

        a.sound();

    }
}
// Inheritance

// Single Inheritance
// Multilevel Inheritance
// Hierarchical Inheritance

class Animal
{
    void eat() {
        System.out.println("Eating....");
    }
}

class Dog extends Animal 
{
    void barks() {
        System.out.println("Dog Barks");
    }
}

public class Pgm3 {

    public static void main(String[] args) {
        
        Dog d = new Dog();

        d.eat();
        d.barks();
    }
}
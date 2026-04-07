abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("playing Music...");
    }
}

abstract class Innova extends Car 
{
    
    @Override
    public void drive() {
        System.out.println("Driving Innova...");
    }
}

class UpdatedInnova extends Innova 
{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class AbstractThings
{
    public static void main(String[] args) {
        
        Car obj = new UpdatedInnova();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
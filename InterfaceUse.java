interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Coding in Laptop...");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Coding in Desktop...");
    }
}

class Developer 
{   
    public void devApp(Computer ob)
    {
        ob.code();
    }
} 

public class InterfaceUse
{
    public static void main(String[] args) {
        
        Computer ob1 = new Laptop();
        Computer ob2 = new Desktop();

        Developer ob = new Developer();
        ob.devApp(ob2);
    }
}
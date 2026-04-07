class Child extends Inheritance
{
    public String n1()
    {
        return "Child class";
    }
}
public class Inheritance
{

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.n1());
    }
}
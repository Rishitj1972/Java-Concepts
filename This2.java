class A
{
    public A()
    {
        System.out.println("in constructor A");
    }
}

class B extends A
{
    public B()
    {
        super(); // this calls the default constructor in the base class.
        System.out.println("in constructor B");
    }
    public B(int a)
    {
        this(); // this calls the default constructor in the current class itself    
        System.out.println("in parameterised constructor B");
    }
}

public class This2
{
    public static void main(String[] args) {
        
        B obj = new B(2);
    }
}
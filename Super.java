class A 
{
    public A(){
        System.out.println("in constructor A");
    }
    public A(int n) {
        System.out.println("in parameterised Constructor A");
    }
}

class B extends A
{
    public B()
    {
        super(); // it is always there even if i dont write it calls the base class constructor
        System.out.println("in constructor B");
    }
    public B(int v)
    {
        super(v); // specifies that it calls the parameterised constructor that is in its base class
        System.out.println("in parameterised constructor B");
    }
}

public class Super
{
    public static void main(String[] args) {
        
        B ob = new B(1);
        // B ob1 = new B(1);
    }
}
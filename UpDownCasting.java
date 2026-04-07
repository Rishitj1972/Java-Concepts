class A {
    public void show() 
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show2() {
        System.out.println("in B show");
    }
}

public class UpDownCasting
{
    public static void main(String[] args) {
        
        A obj = new B();  // upCasting
        obj.show();

        B obj1 = (B) obj; // downCasting from A obj to B reference obj1
        obj1.show2();
    }
}
interface A {
    int age = 22;
    void show();
}

class B implements A 
{
    @Override
    public void show() {
        System.out.println("in show");
    }
}

public class InterfaceFirst
{
    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        System.out.println("Age = "+A.age);
    }
}
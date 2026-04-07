class A 
{
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override // Annotations to prevent some common errors during naming the methods and mentioning compiler 
    public void show() {
        System.out.println("in B show");
    }
}

public class Annotations
{
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
    }
}
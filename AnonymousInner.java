class A {
    public void show() {
        System.out.println("In A show");
    }
}

public class AnonymousInner
{
    public static void main(String[] args) {
        
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
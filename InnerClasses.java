class A {
    int age = 20;

    public void showAge() {
        System.out.println("Age : "+age);
    }

    class B
    {
        public void show() {
            System.out.println("In B");
        }
    }

    static class C {
        public void show() {
            System.out.println("In C");
        }
    }
}

public class InnerClasses
{
    public static void main(String[] args) {
        
        A obj = new A();
        obj.showAge();

        A.B obj1 = obj.new B();
        obj1.show();

        A.C obj2 = new A.C();
        obj2.show();
    }
}
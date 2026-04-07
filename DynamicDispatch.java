class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A {
    @Override
    public void show() {
        System.out.println("in C show");
    }
}

class DyamicDispatch
{
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
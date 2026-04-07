abstract class A 
{
    public abstract void show();
}

public class AbstractAnonymous
{
    public static void main(String[] args) {
        
        A obj = new A() {

            @Override
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
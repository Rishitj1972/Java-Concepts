// With Lambda Epression


@java.lang.FunctionalInterface
interface A
{
    void show(int i);
    // void run(); 
}

public class FunctionalInterface
{
    public static void main(String[] args) {
        
        A obj = i -> System.out.println("in a show"+i);
    
        obj.show(5);
    }
}
class New_Class
{

    public int add(int a, int b) 
    {
        System.out.println("Method");
        return a + b;
    }
}

    
public class Class_Object 
{

    public static void main(String[] args) {

        int num1=5;
        int num2=10;

        New_Class obj = new New_Class();
        int result = obj.add(num1, num2);

        System.out.println("Result: " + result); // 15 is printed as add() returns the sum of num1 and num2
    }
}
class AdvancedCalculator extends Calculator
{
    public int mul(int a, int b)
    {
        return a * b;
    }
    public int div(int a,int b)
    {
        if(b != 0)
            return a / b;
        else
            throw new ArithmeticException("Division by zero");
    }
}

class Calculator extends InheriTypes
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int a,int b)
    {
        return a - b;
    }
}


public class InheriTypes
{
    public static void main(String[] args)
    {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Addition: " + calc.add(10, 5)); // Inherited from Calculator
        System.out.println("Subtraction: " + calc.sub(10, 5)); // Inherited from Calculator
        System.out.println("Multiplication: " + calc.mul(10, 5)); // Defined in AdvancedCalculator
        System.out.println("Division: " + calc.div(10, 5)); // Defined in AdvancedCalculator
    }
}

class Calc
{
    public final void show() {
        System.out.println("in Calc");
    } 
}

class AdvCalc extends Calc
{
    public void show1() {
        System.out.println("in AdvCalc");
    } // method name changed from show to show1 beacause final prohibiting the use of show method from parent class.
}

public class Final
{
    public static void main(String[] args) {

        // final double pi = 3.14;  final variable

        AdvCalc obj = new AdvCalc();
        obj.show();

    }
}
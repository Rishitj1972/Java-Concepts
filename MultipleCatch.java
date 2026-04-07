class MultipleCatch
{

    public static void main(String[] args) {

        int arr[] = new int[5];
        
        int i=0;
        int j=0;

        try
        {
            j = 18/i;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero...");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in limit...");
        }
        catch(Exception e) {
            System.out.println("Something Wrong"+e);
        }
    }
}
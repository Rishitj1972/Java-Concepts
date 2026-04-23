
import java.util.Scanner;

class UpdateAtPos
{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the limit : ");
        int size = ob.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Array Elements : ");
        for(int i = 0 ; i < size ; i++ ) {
            arr[i] = ob.nextInt();
        }

        System.out.println("Enter the pos to be updated : ");
        int pos = ob.nextInt();
        System.out.println("Enter the element to be updated : ");
        int el = ob.nextInt();

        for(int i = 0 ; i < size ; i++ ) {
            
            if(i == pos) {
                arr[i] = el;
            }
        }

        System.out.println("New Array : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
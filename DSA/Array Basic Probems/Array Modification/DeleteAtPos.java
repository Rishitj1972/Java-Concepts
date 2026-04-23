
import java.util.Scanner;

class DeleteAtPos
{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the limit : ");
        int size = ob.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < size ; i++ ) {
            arr[i] = ob.nextInt();
        }

        System.out.println("Enter the position to delete that element : ");
        int pos = ob.nextInt();

        for(int i = pos ; i < size - 1; i++ ){
                arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("New Array");
        for(int i = 0 ; i < size ; i++ ) {
            System.out.println(arr[i]);
        }
    }
}
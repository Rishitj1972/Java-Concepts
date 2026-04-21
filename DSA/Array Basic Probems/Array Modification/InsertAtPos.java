
import java.util.Scanner;

class InsertAtPos
{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = ob.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements to array : ");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = ob.nextInt();
        }

        System.out.println("Enter the element to insert : ");
        int el = ob.nextInt();

        System.out.println("Enter the position to enter : ");
        int pos = ob.nextInt();

        int newArr[] = new int[size + 1];

        for(int i = 0 ; i < arr.length ; i++ ) {
            newArr[i] = arr[i];
        }

        newArr[pos] = el;

        for (int i = pos; i < size; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Updated array:");
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

class Pgm1
{
    public static void main(String[] args) {
        
        // Array List

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Rishi");
        arr.add("Rishi TJ");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.set(0,"Rishi");
        System.out.println(arr);

        // Linked List
        LinkedList<String> arr1 = new LinkedList<>();
        arr1.add("Rishi");
        System.err.println(arr1);

        // HashSet
        HashSet<String> arr2 = new HashSet<>();
        arr2.add("Rishi");
        System.out.println(arr2);



        
    }
}
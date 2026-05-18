
import java.util.HashMap;

public class Hashing 
{
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"Rishi");
        map.put(2,"Rishi TJ"); // insert element

        System.out.println(map);

        System.out.println(map.get(1)); // access element based on key value
        map.remove(2);  // remove element 

        System.out.println(map); // print key-value

        System.out.println(map.containsKey(1));  // check key exists
    }
}
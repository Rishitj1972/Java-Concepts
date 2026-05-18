
import java.util.HashSet;

class HashSetPgm1
{
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);
    }
}
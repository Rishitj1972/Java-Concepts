
import java.util.HashMap;

class CountFrequency
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,2,4,5,5,6,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length; i++) {

            Integer c = map.get(arr[i]);

            if(map.get(arr[i]) == null) {
                map.put(arr[i],1);
            }

            else {
                map.put(arr[i],++c);
            }
        }

        System.out.println(map);
    }
}
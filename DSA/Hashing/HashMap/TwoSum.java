
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,4};
        int target = 9;

        Solution n = new Solution();
        int[] result = n.twoSum(arr, target);

        if(result.length == 0) {
            System.out.println("No pair found");
        }
        else {
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        }
    }
}

class Solution {
    public int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return new int[] {
                    map.get(complement),
                    i
                };
            }
            map.put(arr[i], i);
        }

        return new int[] {};
    }
}

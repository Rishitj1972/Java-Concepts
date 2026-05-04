class Pgm1
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int left = 0;
        int right = arr.length - 1;

        while(left < (right / 2)) {
            // logic here
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // move pointers
            left++;
            right--;
        }

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
}
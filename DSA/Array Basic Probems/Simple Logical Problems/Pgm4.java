
class Pgm4
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,-2,3,2,2,5,6,0,2};
        int n = arr.length;
        
        for(int i = 0 ; i < n; i++ ){

            for(int j = i + 1 ; j < n ; j++ ) {
                if(arr[i] == arr[j]) 
                {
                    // shifting right to left
                    for(int k = j ; k < n - 1; k ++ ) {
                        arr[k] = arr[k + 1];
                    }
                    n--; // reduce size
                    j--; // recheck same element
                }
            }
        }
        for(int i = 0;i< n;i++) {
            System.out.println(arr[i]);
        }
    }
}
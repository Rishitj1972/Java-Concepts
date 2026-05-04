class Pgm3
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,2,3,4,5};

        int index = 0;

        for(int i = 0 ; i < arr.length; i++ ) {

            if(arr[i] != arr[index]) {
                index++;
                arr[index]= arr[i];
            }
        }
        for(int j = 0 ; j <= index; j++ ) {
            System.out.println(arr[j]);
        }
    }
}
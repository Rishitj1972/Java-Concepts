class Pgm2
{
    public static void main(String[] args) {
        
        int arr[] = {0,1,2,3,0,40,5,0,0,6};

        // Important Concept

        int index = 0;

        for(int i = 0 ; i < arr.length ; i++ ) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0 ; i < arr.length ; i++ ){
            if(i >= index) {
                arr[i] = 0;
            }
        }

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
        }
    }
    
}
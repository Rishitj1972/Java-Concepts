class Pgm3 
{
    public static void main(String[] args){

        int arr[] = {1,-2,2,3,4,0,5,7,5,2,5};
        int n = arr.length;

        boolean visited[] = new boolean[n];
        
        for(int i = 0 ; i < n ; i++ ) {
            
            if(visited[i]) continue;
            int count = 0;
            
            for(int j = i; j < n ; j++ ) { //already counted previous so j must start from i 
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                } 
            }
            if(count > 1) {
                System.out.println("Duplicates : "+arr[i]+" appears "+count+" times");
            }
        }
    }
}
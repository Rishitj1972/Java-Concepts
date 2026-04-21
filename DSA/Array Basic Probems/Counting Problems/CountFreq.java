class CountFreq
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,5,5,2,6,5,1};
        
        boolean visited[] = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {

            System.out.println(visited[i]);

            if(visited[i]) continue;

            int count = 0;

            for(int j = 0 ; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+" appears : "+count+" times");
        }
    }
}
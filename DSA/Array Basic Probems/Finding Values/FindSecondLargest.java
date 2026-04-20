class SecondLargest
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,-2,2,4,5,4,6,7,10,9};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        boolean foundSecond = false;

        for(int i = 0;i < arr.length; i++) {
            
            if(arr[i] > max) {
                smax = max;
                max  = arr[i];
                if(smax != Integer.MIN_VALUE) {
                    foundSecond = true;
                }
            }
            if(arr[i] < max && arr[i] > smax) {
                smax = arr[i];
                foundSecond = true;
            }
        }
        if(foundSecond) {
            System.err.println("Max = "+max);
            System.err.println("Second Max = "+smax);
        } else {
            System.out.println("No SecondLargest");
        }
    }
}
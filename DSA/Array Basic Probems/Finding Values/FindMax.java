class FindMax
{
    public static void main(String[] args) {
        
        int[] arr = {1,2,6,3,4};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element in an Array is : "+max);
    }
}
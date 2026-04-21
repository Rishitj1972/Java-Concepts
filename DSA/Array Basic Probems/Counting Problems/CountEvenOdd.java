class CountEvenOdd
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }

        System.out.println("Even Count = "+count1);
        System.out.println("Odd Count = "+count2);
    }
}
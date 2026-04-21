class SwapNum
{
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,42,3,6};

        int temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
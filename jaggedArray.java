class jaggedArray
{

    public static void main(String[] args) 
    {

        int arr[][] = new int[3][];

        arr[0] = new int[2]; // First inner array has 2 elements
        arr[1] = new int[4]; // Second inner array has 4 elements
        arr[2] = new int[3]; // Third inner array has 3 elements
        
        for (int arr1[] : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
        
    }
}
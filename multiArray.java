class multiArray
{

    public static void main(String[] args) 
    {

        int arr[][] = new int[3][4];

        for(int i=0;i<3;i++) { // 3 inner arrays

            for(int j=0;j<4;j++) { // 4 elements in each inner array
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Initializing a 2D array with random values

        int arr2[][] = new int[3][4];

        for(int i=0;i<3;i++) {

            for(int j=0;j<4;j++) {

                arr2[i][j] = (int)(Math.random() * 10);
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
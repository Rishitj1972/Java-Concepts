class Pgm5
{
    public static void main(String[] args) {
        
        int arr1[] = {1,3,4,6,6};
        int arr2[] = {3,4,67,2,7};
        int n = arr1.length;
        int m = arr2.length;

        int newArray[] = new int[n + m];

        for(int i = 0 ; i < n;i++ ) {
            newArray[i] = arr1[i];
        }

        for(int j = 0 ; j < m; j ++ ) {
            newArray[n + j] = arr2[j];
        }

        for (int idx = 0; idx < newArray.length; idx++) {
            System.out.println(newArray[idx]);
        }
    }
}
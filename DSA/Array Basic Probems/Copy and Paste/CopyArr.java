
class CopyArr
{
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int newArr[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++ ) {
            newArr[i] = arr[i];
        }

        System.out.println("Old Array");
        for(int i = 0 ; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
        System.out.println("New Array");
        for(int i = 0 ; i < arr.length; i++ ) {
            System.out.println(newArr[i]);
        }
    }
}
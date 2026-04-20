class LinearSearch 
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,5,-4,6,7,3};

        int el = 3;
        boolean found = false;

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == el) {
                found = true;
                System.out.println("Element Found at index : "+i);
            }
        }
        if(!found) {
            System.out.println("-1");
        }
    }
}
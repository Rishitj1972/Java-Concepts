class Array 
{

    public static void main(String[] args) 
    {

        // 1 When array is initialized during declaration

        int nums[] = {2,3,4,5,6,7};

        for(int i=0; i<nums.length; i++) 
        {
            System.out.println("Element at index " + i + ": " + nums[i]);
        }

        // 2 When array is initialized after declaration

        int num2[] = new int[5];

        num2[0] = 10;
        num2[1] = 20;
        num2[2] = 30;
        num2[3] = 40;
        num2[4] = 50;

        for(int i=0;i<5;i++) {
            System.out.println("Element at index " + i + ": " + num2[i]);
        }
    }
}
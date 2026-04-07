class TryCatch
{
    public static void main(String[] args) {

        int i=0;
        int j=0;

        try 
        {
            j = 12/i;
        } catch(Exception e) {
            System.out.println("Something is Wrong...");
        }

        System.out.println(j);
        
    }
}
class New_Method
{
    public void PlayMusic() {
        System.out.println("Playing Music");
    }

    public String GetName() {
        return "My Music Player";
    }
    
    public int AddNumbers(int a, int b) {
        return a + b;
    }
}


public class Methods
{

    public static void main(String[] args) {

        New_Method obj = new New_Method();
        
        obj.PlayMusic();
        
        String name = obj.GetName();

        int sum = obj.AddNumbers(5, 10);
        
        System.out.println("Name: " + name);
        System.out.println("Sum: " + sum);

    }
}
class StaticClass
{
    int id;
    String name;
    static String schoolName;

    static {
        schoolName = "Greenwood High"; // Static block to initialize static variable
        System.out.println("This is a static block. School Name initialized.");
    }

    public StaticClass() {
        System.out.println("This is a constructor.");
        id = 1;
        name = "John";
    }
}

public class StaticBlock
{

    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("StaticClass"); // This will trigger the static block to execute

        StaticClass student1 = new StaticClass();
        System.out.println("ID: " + student1.id);
        System.out.println("Name: " + student1.name);
        System.out.println("School Name: " + StaticClass.schoolName); // Accessing static variable


    }
}
class Student
{

    String name;
    int id;
    static String schoolName;

    public void Display() 
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("School Name: " + schoolName);
    }
}


public class StaticVar
{

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Alice";
        s.id = 101;
        Student.schoolName = "Greenwood High";

        Student s1 = new Student();
        s1.name = "Bob";
        s1.id = 102;
        // schoolName is static, so it is shared among all instances
        Student.schoolName = "Greenwood High";

        s.Display();
        System.out.println("--------------");
        s1.Display();
        System.out.println("--------------");
    }
}
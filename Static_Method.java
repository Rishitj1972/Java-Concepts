class Student
{
    String name;
    int age;

    static String schoolName;

    public void show() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School Name: " + schoolName);
    }

    public static void show(Student student) // Static method
    {
        System.out.println("This is a static method.");
        System.out.println("name : "+ student.name+" : "+student.age+" : "+schoolName); 
    }
}


public class Static_Method 
{

    public static void main(String[] args) 
    {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 16;
        Student.schoolName = "Greenwood High"; // Setting static variable

        Student student2 = new Student();
        student2.name = "Alice";
        student2.age = 17;
        // Student.schoolName is already set to "Greenwood High"

        student1.show();
        System.out.println();
        student2.show();

        System.out.println();
        Student.show(student1); // Calling static method by passing student1
        Student.show(student2); // Calling static method by passing student2
    }   
}
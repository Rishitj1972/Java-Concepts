class Student
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    } // you can also give values to the variables here, but it is not necessary
}

public class Constructor
{
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");
        
        System.out.println("Student 1: ID = " + s1.id + ", Name = " + s1.name);
        System.out.println("Student 2: ID = " + s2.id + ", Name = " + s2.name);
    }
}
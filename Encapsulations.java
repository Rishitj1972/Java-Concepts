class Student
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Encapsulations
{

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

// Encapsulation is a fundamental principle of object-oriented programming 
// that restricts direct access to an object's data and allows it to be accessed 
// only through methods. In the above code, the Student class has private fields 
// (name and age) and public getter and setter methods to access and modify those fields. 
// This ensures that the internal state of the object is protected from unauthorized access 
// and modification, promoting data integrity and security.
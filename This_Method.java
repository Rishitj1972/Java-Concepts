class Student
{
    private int age;

    public int getAge1() {
        return age;
    }

    public int getAge2() {
        return age;
    }

    public void setAge1(int age, Student s) {
        Student stud = s;
        stud.age = age;  // this.age = age;  
        // this is used to refer to the current object, 
        // it is used to avoid confusion between local variable and instance variable
    }

    public void setAge2(int age) {
        this.age = age;  // this.age = age;  
        // this is used to refer to the current object, 
        // it is used to avoid confusion between local variable and instance variable
    }
}

public class This_Method {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setAge1(30,s1);
        s1.setAge2(30);
        System.out.println(s1.getAge1());
        System.out.println(s1.getAge2());
    }
}

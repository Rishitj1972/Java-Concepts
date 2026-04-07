class Students {
    
    String name;
    int age;
}


public class ArrayOfObject {

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

        s1.name = "Alice";
        s1.age = 20;    
        s2.name = "Bob";
        s2.age = 22;

        Students students[] = new Students[2];

        students[0] = s1;
        students[1] = s2;

        for (Students student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}
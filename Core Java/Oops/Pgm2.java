// Encapsulation

class Student
{
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Pgm2
{
    public static void main(String[] args) {
        

        Student s = new Student();

        s.setMarks(100);

        System.out.println("Marks = "+s.getMarks());
    }
}
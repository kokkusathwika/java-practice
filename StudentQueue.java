
public class StudentQueue {

    String name;
    int rollNo;
    int marks;

    public StudentQueue(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        StudentQueue student1 = new StudentQueue("k.sathwika", 4013, 85);
        StudentQueue student2 = new StudentQueue("a.arun", 1136, 90);

        System.out.println("Student 1: " + student1.getName() + ", Roll No: " + student1.getRollNo() + ", Marks: " + student1.getMarks());
        System.out.println("Student 2: " + student2.getName() + ", Roll No: " + student2.getRollNo() + ", Marks: " + student2.getMarks());
    }

}

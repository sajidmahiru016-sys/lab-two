// Lab Nine Task 1
class Student {
    private String name;
    private int id;
    private double cgpa;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class StudentId {
    public static void main(String[] args) {

        Student student = new Student();

        // Setting values
        student.setName("Istiak Khan");
        student.setId(253051);
        student.setCgpa(3.85);

        // Displaying values
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("CGPA: " + student.getCgpa());
    }
}

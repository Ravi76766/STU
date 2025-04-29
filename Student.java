package STU;

public class Student {
    // Student attributes
    String name;
    int id;
    String course;
    // Constructor
    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a student object with hardcoded data
        Student student1 = new Student(
            "Alice Johnson",    // name
            101,                // id
            "Computer Science", // course
        );

        // Display student details
        student1.displayDetails();
    }
}

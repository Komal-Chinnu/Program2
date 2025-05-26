

public class Main {

    public static void main (String[] args) {

        Student s1 = new Student("Komal", 2003, 9, 13);
        s1.displayInfo();

        StudentCourses sc = new StudentCourses();
        sc.addCourse("OS", 85);
        sc.addCourse("DBMS", 90);
        sc.addCourse("Computer Networking", 95);

        sc.displayCourses();
    }
}
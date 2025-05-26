
public class StudentCourses {
    String[] courseNames = new String[5];  
    int[] marks = new int[5];             
    int count = 0;                         

    
    public void addCourse(String courseName, int mark) {
        if (count < 5) {
            courseNames[count] = courseName;
            marks[count] = mark;
            count++;
        } else {
            System.out.println("Cannot add more courses. Limit reached!");
        }
    }

   
    public void displayCourses() {
        System.out.println("Courses and Marks:");
        for (int i = 0; i < count; i++) {
            System.out.println(courseNames[i] + " : " + marks[i] + " Marks");
        }
    }
}


import java.util.Calendar;

public class Student {

    String name;
    int birthyear, birthmonth, birthday;

    public Student(String name, int birthyear, int birthmonth, int birthday) {
        this.name = name;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
    }

    public int calculateAge() {
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthyear;

        if ((today.get(Calendar.MONTH) + 1) < birthmonth ||
            ((today.get(Calendar.MONTH) + 1) == birthmonth && today.get(Calendar.DAY_OF_MONTH) < birthday)) {
            age--;
        }
        return age;
    }

    public void displayInfo() {
        System.out.println("Student Details");
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + calculateAge() + " Years");
    }
}
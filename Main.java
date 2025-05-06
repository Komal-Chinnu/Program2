package Program2;

// File: MainApp.java
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       
        Date dob = new Date(103, 8, 13);  // 2003, September, 13
        
        Employee emp = new Employee("Komal", dob, 101, 50000.0);

        emp.displayEmployeeDetails();
    }
}

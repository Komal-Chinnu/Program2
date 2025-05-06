

import java.util.Date;


public class Employee extends Person {
    int empId;
    double salary;

   
    public Employee(String name, Date dateOfBirth, int empId, double salary) {
        super(name, dateOfBirth);  // calling Person class constructor
        this.empId = empId;
        this.salary = salary;
    }

  
    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}


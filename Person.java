


import java.util.Date;

public class Person {
    String name;
    Date dateOfBirth;

    
    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

   
    public void displayName() {
        System.out.println("Name: " + name);
    }

    
    public void displayAge() {
        Date today = new Date(); 

        int birthYear = 1900 + dateOfBirth.getYear();
        int currentYear = 1900 + today.getYear();

        int age = currentYear - birthYear;
        System.out.println("Age: " + age + " years");
    }
}


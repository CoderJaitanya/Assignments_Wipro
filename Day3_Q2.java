abstract class Employee {                                                // Abstract class
    String name;
    int id;

    public Employee(String name, int id) {                                // Constructor
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract void displayDetails();
}

class FullTimeEmployee extends Employee {                                                    //child 1
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {                      // Constructor
        super(name, id); 
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs" + calculateSalary());
    }
}


class PartTimeEmployee extends Employee {                                                    //child 2
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {           //Constructor
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs" + calculateSalary());
    }
}


public class Day3_Q2{                                                                   // Main class
    public static void main(String[] args) {
        Employee[] e = new Employee[2];
        e[0] = new FullTimeEmployee("Jaitanya Handa", 6139, 50000);
        e[1] = new PartTimeEmployee("Aman Sharma", 6001, 200, 6);

        for (int i=0;i<e.length;i++) {
            e[i].displayDetails();
            System.out.println();
        }
    }
}

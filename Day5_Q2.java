import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {                     // Constructor
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Day5_Q2 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
            new Employee("Jaitanya", 23, 50000),
            new Employee("Aman", 35, 70000),
            new Employee("Raj", 21, 80000),
            new Employee("Suraj", 31, 45000),
            new Employee("Smarth", 32, 60000)
        );
        
        List<String> employeeNames = emp.stream()
            .filter(e -> e.age > 30)                       // Filter employees older than 30
            .map(e -> e.name)                              // mapping       
            .collect(Collectors.toList());                 // Collecting names to the list
        
        OptionalDouble avg = emp.stream()                      // OptionalDouble Class holds double value.
            .filter(e -> e.age > 30)                           // Filter employees older than 30
            .mapToDouble(e -> e.salary)                        // Extract salaries
            .average(); 
        
        System.out.println("Employees age>30 : " + employeeNames);
        System.out.println("Average Salary: " + avg.getAsDouble());
    }
}
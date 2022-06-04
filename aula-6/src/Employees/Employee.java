package Employees;

public class Employee {
    public String name;
    public String role;
    public double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        String _name = "Name: " + this.name;
        String _role = "Role: " + this.role;
        String _salary = "Salary: " + this.salary;

        return _name + _role + _salary;
    }
}

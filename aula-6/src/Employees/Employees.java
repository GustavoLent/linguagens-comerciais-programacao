package Employees;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void print() {
        Printer printer = new Printer();

        for (Employee employee : this.employees) {
            printer.neutral(employee.toString());
        }
    }
}

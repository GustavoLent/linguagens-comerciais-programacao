package Employees;

import java.io.File;
import java.util.Scanner;

public class Exercise {
    public void run() {
        Scanner scan = new Scanner(new File("C:\\Users\\aluno\\Documents\\aula-6\\employees.txt"));
        Printer printer = new Printer();

        Employees employees = new Employees();
        int lineCount = 1;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner lineData = new Scanner(line).useDelimiter(";\\s");

            try {
                String name = lineData.next();
                String role = lineData.next();
                double salary = Double.parseDouble(lineData.next());

                Employee employee = new Employee(name, role, salary);
                employees.addEmployee(employee);
            } catch (Exception e) {
                printer.error("Error on line \"" + lineCount + "\": " + e.toString());
            }

            lineData.close();
            lineCount++;
        }
    }
}

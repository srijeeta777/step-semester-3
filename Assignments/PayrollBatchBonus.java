class Employee {
    String id;
    double salary;

    // Constructor with field/parameter naming clash
    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    // Parameter name intentionally clashes with field name
    public void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    public void printSalary() {
        System.out.println(id + " | Final Salary: Rs " + salary);
    }
}

public class PayrollBatchBonus {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("E-101", 40000),
                new Employee("E-102", 55000),
                new Employee("E-103", 62000),
                new Employee("E-104", 48000)
        };

        double bonus = 5000;

        // Single pass through the array
        for (Employee employee : employees) {
            employee.raiseSalary(bonus);
            employee.printSalary();
        }
    }
}

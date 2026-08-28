package Assignments.M5;

class EmployeeStatic {

    String empName;
    double salary;

    static String companyName =
            "Bright Horizon Technologies";

    static int employeeCount = 0;

    EmployeeStatic(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Assignments.M5.EmployeeStatic employee1 =
                new Assignments.M5.EmployeeStatic("Rahul", 50000);

        Assignments.M5.EmployeeStatic employee2 =
                new Assignments.M5.EmployeeStatic("Priya", 60000);

        Assignments.M5.EmployeeStatic employee3 =
                new Assignments.M5.EmployeeStatic("Arjun", 55000);

        Assignments.M5.EmployeeStatic.printCompanyInfo();
    }
}
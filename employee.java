class Employee {
    String name;
    double basicSalary;
    double hra;

    Employee(String name, double basicSalary, double hra) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    double getSalary() {
        return basicSalary + hra;
    }
}

class Manager extends Employee {
    double ta;
    double da;
    double incentive;

    Manager(String name, double basicSalary, double hra, double ta, double da, double incentive) {
        super(name, basicSalary, hra);
        this.ta = ta;
        this.da = da;
        this.incentive = incentive;
    }

    @Override
    double getSalary() {
        return super.getSalary() + ta + da + incentive;
    }
}

public class Sathya {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000, 10000);
        Manager mgr = new Manager("Jane", 70000, 15000, 5000, 7000, 10000);
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Manager Salary: " + mgr.getSalary());
    }
}

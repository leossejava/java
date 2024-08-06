class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double travelAllowance;
    double houseRentAllowance;

    Manager(String name, double baseSalary, double travelAllowance, double houseRentAllowance) {
        super(name, baseSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    double getTotalSalary() {
        return baseSalary + travelAllowance + houseRentAllowance;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        System.out.println("Employee Salary: " + emp.getSalary());

        Manager mgr = new Manager("Bob", 70000, 5000, 3000);
        System.out.println("Manager Total Salary: " + mgr.getTotalSalary());
    }
}

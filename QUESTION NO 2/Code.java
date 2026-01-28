class Employee {
    public double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(120, 300);

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}

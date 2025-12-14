import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter allowance: ");
        double allowance = sc.nextDouble();
        System.out.print("Enter deduction: ");
        double deduction = sc.nextDouble();

        double totalSalary = basic + allowance - deduction;
        System.out.println("Total Salary = " + totalSalary);
    }
}

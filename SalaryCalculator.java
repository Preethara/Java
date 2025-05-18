import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String employeeName, employeeID, position;
        int salaryPerDay = 0, salary = 0, salaryForOT = 0, noOfDaysOT = 0;

        System.out.print("Enter your position: ");
        position = input.nextLine();

        System.out.print("Enter your name: ");
        employeeName = input.nextLine();

        System.out.print("Enter your ID: ");
        employeeID = input.nextLine();

        System.out.print("Enter number of OT days: ");
        noOfDaysOT = input.nextInt();

        switch (position) {
            case "Consultant":
                salaryPerDay = 800;
                salaryForOT = noOfDaysOT * 100;
                break;
            case "Analyst":
                salaryPerDay = 900;
                salaryForOT = noOfDaysOT * 500;
                break;
            case "Tester":
                salaryPerDay = 1000;
                salaryForOT = noOfDaysOT * 700;
                break;
            case "Developer":
                salaryPerDay = 1200;
                salaryForOT = noOfDaysOT * 900;
                break;
            case "TeamLeader":
                salaryPerDay = 1300;
                salaryForOT = noOfDaysOT * 1000;
                break;
            default:
                System.out.println("Invalid position entered.");
                return; // Exit the program if invalid input
        }

        salary = salaryPerDay * 30 + salaryForOT;

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeID);
        System.out.println("Position: " + position);
        System.out.println("Monthly Salary (with OT): ₹" + salary);
    }
}
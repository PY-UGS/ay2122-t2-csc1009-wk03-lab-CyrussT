import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numOfYears = scanner.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = scanner.nextDouble();
        Loan mortgage = new Loan(interestRate, numOfYears, loanAmount);
        System.out.println("The loan was created on " + mortgage.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", mortgage.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", mortgage.getTotalPayment());
    }
}

package pack;

import java.util.Scanner;

public class SalaryEmployee {
    double basicPay, deduction, bonus;  // Instance variables

    // Method to get input from the user
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = scanner.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = scanner.nextDouble();

    }
}

package pack;

public class SalaryEmployee3 extends SalaryEmployee2 {

    // Method to calculate total salary and display the salary slip
    public void generateSalarySlip() {
        calculateComponents();  // Calculate HRA and PF

        // Calculate total salary
        double totalSalary = basicPay + hra - pf - deduction + bonus;

        // Display the salary slip
        System.out.println("\n====== Salary Slip ======");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA (5% of Basic Pay): " + hra);
        System.out.println("PF (20% of Basic Pay): " + pf);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
        System.out.println("-------------------------");
        System.out.println("Total Salary by Hand: " + totalSalary);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create an instance of SalarySlip class
    	SalaryEmployee3 slip = new SalaryEmployee3();

        // Get employee details and generate salary slip
        slip.getDetails();
        slip.generateSalarySlip();
    }
}

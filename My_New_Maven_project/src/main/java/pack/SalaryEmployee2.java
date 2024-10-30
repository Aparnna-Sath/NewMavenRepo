package pack;

public class SalaryEmployee2 extends SalaryEmployee {
    double hra, pf;  // Instance variables for HRA and PF

    // Method to calculate HRA and PF based on basic pay
    public void calculateComponents() {
        hra = 0.05 * basicPay;  // 5% of basic pay
        pf = 0.20 * basicPay;   // 20% of basic pay
    }
}

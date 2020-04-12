import java.util.Arrays;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Ali", "K", "54400-2222222-2", 345.0, 0.99);
        System.out.println(commissionEmployee);
        System.out.printf("Earnings: %.2f", commissionEmployee.earnings());

        System.out.println();
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Rozi", "khan", "22222-22222222-2", 500, 0.99, 20000);
        System.out.println(basePlusCommissionEmployee);
        System.out.printf("Earnings: %.2f", basePlusCommissionEmployee.earnings());
    }
}

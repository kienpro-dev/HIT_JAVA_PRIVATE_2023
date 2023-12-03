package BTVN.Bai2;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }

    @Override
    public void input() {
        super.input();
    }
}

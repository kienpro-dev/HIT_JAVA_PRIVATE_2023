package BTVN.Bai2;

public class PartTimeEmployee extends Employee{
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Working hours: ");
        workingHours = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }
}

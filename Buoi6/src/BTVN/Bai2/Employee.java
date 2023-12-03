package BTVN.Bai2;

import java.util.Scanner;

public abstract class Employee implements IEmployee{
    Scanner sc = new Scanner(System.in);
    
    private String name;

    private int paymentPerHour;

    public Employee() {
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    public void input() {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Payment per hour: ");
        paymentPerHour = sc.nextInt();
        sc.nextLine();
    }
}

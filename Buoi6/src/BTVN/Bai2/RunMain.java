package BTVN.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        EmployeeService service = new EmployeeServiceImpl(employees);
        while(true) {
            System.out.println("1. Input employee");
            System.out.println("2. Output employee");
            System.out.println("3. Sort employee by salary");
            System.out.println("4. Find employee with highest working hours");
            System.out.println("5. Delete employee with lowest working hours");

            System.out.print("Choose: ");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    service.addEmployee();
                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    service.sortedEmployee();
                    break;
                case 4:
                    service.find();
                    break;
                case 5:
                    service.delete();
                    break;
                default:
                    return;
            }
        }
    }
}

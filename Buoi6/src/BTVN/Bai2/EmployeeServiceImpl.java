package BTVN.Bai2;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner sc = new Scanner(System.in);

    List<Employee> employees;

    public EmployeeServiceImpl(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee() {
        Employee e;
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.print("Choose: ");
        int n = sc.nextInt();
        sc.nextLine();

        switch (n) {
            case 1:
                e = new FullTimeEmployee();
                e.input();
                employees.add(e);
            case 2:
                e = new PartTimeEmployee();
                e.input();
                employees.add(e);
            default:
                return;
        }

    }

    @Override
    public void display() {
        for (Employee e:
             employees) {
            System.out.println(e);
        }
    }

    @Override
    public void sortedEmployee() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.calculateSalary() - o2.calculateSalary();
            }
        });
    }

    @Override
    public void find() {
        List<Employee> employees2 = new ArrayList<>();
        int h = 8;
        for (Employee e:
             employees) {
            int hour = ((PartTimeEmployee) e).getWorkingHours();
            if(e instanceof PartTimeEmployee && hour > h) {
                h = hour;
            }
        }

        for (Employee e:
             employees) {
            if(h > 8) {
                int hour = ((PartTimeEmployee) e).getWorkingHours();
                if(hour == h) {
                    employees2.add(e);
                }
            } else {
                if(e instanceof FullTimeEmployee) {
                    employees2.add(e);
                }
            }
        }

        for (Employee e:
             employees2) {
            System.out.println(e);
        }
    }

    @Override
    public void delete() {
        int h = 8;
        for (Employee e:
             employees) {
            int hour = ((PartTimeEmployee) e).getWorkingHours();
            if(e instanceof PartTimeEmployee && hour < h) {
                h = hour;
            }
        }

        for (Employee e:
             employees) {
            if(h > 8) {
                int hour = ((PartTimeEmployee) e).getWorkingHours();
                if(hour == h) {
                    employees.remove(e);
                }
            } else {
                if(e instanceof FullTimeEmployee) {
                    employees.remove(e);
                }
            }
        }
    }
}

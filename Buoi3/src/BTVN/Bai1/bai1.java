package BTVN.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        List<Vegetable> list = new ArrayList<>();
        int option;

        do {
            option = menu();

            switch (option) {
                case 1: {
                    list.add(newVegetable());
                    break;
                }
                case 2: {
                    showList(list);
                    break;
                }
                case 3: {
                    sortByRevenue(list);
                    showList(list);
                    break;
                }
                case 4: {
                    sortByUnit(list);
                    showList(list);
                    break;
                }
                case 5: {
                    System.out.print("Enter your keyword: ");
                    String keyword = new Scanner(System.in).nextLine();
                    searchByKeyword(list, keyword);
                    break;
                }
                default:
                    break;
            }
        } while (option != 6);
    }

    public static int menu() {
        System.out.println("__________MENU__________");
        System.out.println("1. Add new vegetable");
        System.out.println("2. Show vegetables list");
        System.out.println("3. Sort by revenue");
        System.out.println("4. Group by unit");
        System.out.println("5. Search by keyword");
        System.out.println("6. Exit");
        System.out.println("________________________");

        System.out.print("Enter your option: ");
        return new Scanner(System.in).nextInt();
    }

    public static Vegetable newVegetable() {
        Vegetable res = new Vegetable();
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        res.setId(sc.nextLine());
        System.out.print("Name: ");
        res.setName(sc.nextLine());
        System.out.print("Unit: ");
        res.setUnit(sc.nextLine());
        System.out.print("Quantity Sold: ");
        res.setQuantitySold(sc.nextInt());
        System.out.print("Sale: ");
        res.setSale(sc.nextInt());
        System.out.print("Price: ");
        res.setPrice(sc.nextDouble());

        return res;
    }

    public static void showList(List<Vegetable> list) {
        System.out.printf("%-6s %-15s %-10s %-15s %-8s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity Sold", "Sale", "Price", "Revenue");
        for (Vegetable vegetable : list) {
            vegetable.display();
        }
    }

    public static void sortByRevenue(List<Vegetable> list) {
        int n = list.size();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (!list.get(i).compareByRevenue(list.get(j))) {
                    Vegetable temp = new Vegetable();
                    temp.setVegetable(list.get(i));
                    list.get(i).setVegetable(list.get(j));
                    list.get(j).setVegetable(temp);
                }
    }

    public static void sortByUnit(List<Vegetable> list) {
        int n = list.size();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (!list.get(i).compareByUnit(list.get(j))) {
                    Vegetable temp = new Vegetable();
                    temp.setVegetable(list.get(i));
                    list.get(i).setVegetable(list.get(j));
                    list.get(j).setVegetable(temp);
                }
    }

    public static void searchByKeyword(List<Vegetable> list, String keyword) {
        System.out.printf("%-6s %-15s %-10s %-15s %-8s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity Sold", "Sale", "Price", "Revenue");
        for (Vegetable vegetable : list)
            if (vegetable.getName().contains(keyword)) {
                vegetable.display();
            }
    }
}
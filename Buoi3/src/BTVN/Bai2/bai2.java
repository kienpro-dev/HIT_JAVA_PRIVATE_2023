package BTVN.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        List<Subject> list = new ArrayList<>();
        int option;

        do {
            option = menu();

            switch (option) {
                case 1: {
                   list.add(newSubject());
                   break;
                }
                case 2: {
                    showList(list);
                    break;
                }
                case 3: {
                    sortByTimeEnd(list);
                    showList(list);
                    break;
                }
                case 4: {
                    maximumLessons(list);
                    break;
                }
                default:
                    break;
            }
        } while (option != 5);
    }

    public static int menu() {
        System.out.println("__________MENU__________");
        System.out.println("1. Add new subject");
        System.out.println("2. Show subjects list");
        System.out.println("3. Sort by time end");
        System.out.println("4. Hehehehe");
        System.out.println("5. Exit");
        System.out.println("________________________");

        System.out.print("Enter your option: ");
        return new Scanner(System.in).nextInt();
    }

    public static Subject newSubject() {
        Subject res = new Subject();
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        res.setId(sc.nextLine());
        System.out.print("Subject name: ");
        res.setSubjectName(sc.nextLine());
        System.out.print("Student count: ");
        res.setStudentCount(sc.nextInt());
        sc.nextLine();
        System.out.print("Time start: ");
        res.setTimeStart(sc.nextLine());
        System.out.print("Time end: ");
        res.setTimeEnd(sc.nextLine());

        return res;
    }

    public static void showList(List<Subject> list) {
        System.out.printf("%-8s %-25s %-15s %-25s\n", "ID", "Subject name", "Student count", "Time start - end");
        for (Subject subject : list) {
            subject.display();
        }
    }

    public static void sortByTimeEnd(List<Subject> list) {
        int n = list.size();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (!list.get(i).compareByTimeEnd(list.get(j))) {
                    Subject temp = new Subject();
                    temp.setSubject(list.get(i));
                    list.get(i).setSubject(list.get(j));
                    list.get(j).setSubject(temp);
                }
    }

    public static void maximumLessons(List<Subject> list) {
        List<Subject> tempList = new ArrayList<>(list);
        sortByTimeEnd(tempList);

        String timeStart, timeEnd;
        System.out.print("Start time: ");
        timeStart = new Scanner(System.in).nextLine();
        System.out.print("Finish time: ");
        timeEnd = new Scanner(System.in).nextLine();

        int cnt = 0;
        List<Subject> resList = new ArrayList<>();
        String lastSubjectEnd = timeStart;
        for (Subject subject : list)
            if (compareTime(subject.getTimeEnd(), timeEnd) && compareTime(lastSubjectEnd, subject.getTimeStart())) {
                cnt++;
                lastSubjectEnd = subject.getTimeEnd();
                resList.add(subject);
            }

        System.out.println("Maximum lessons = " + cnt);
        if (cnt > 0) {
            showList(resList);
        }
    }

    public static boolean compareTime(String t1, String t2) {
        return Integer.parseInt(t1.split(":")[0]) * 60 + Integer.parseInt(t1.split(":")[1]) <=
                Integer.parseInt(t2.split(":")[0]) * 60 + Integer.parseInt(t2.split(":")[1]);
    }
}
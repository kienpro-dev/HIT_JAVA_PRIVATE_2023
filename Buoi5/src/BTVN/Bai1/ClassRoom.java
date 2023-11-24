package BTVN.Bai1;


import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    static ArrayList<Student> li = new ArrayList<>();

    public static void inputList(){
        System.out.println("<==================INPUT LIST STUDENT================>");
        while(true){
            Student x =  new Student();
            System.out.println("");
            x.input();
            if(x.getId() == 555)
                break;
            if(!checkStudent(x.getId()))
                li.add(x);
            else
                System.out.println("Students already exist! ");
        }
    }
    //Phương thức này là để kiểm tra xem sinh viên đó đã có trong danh sách chưa
    public static boolean checkStudent(int check){
        if(li != null)
            for (Student x: li) {
                if(x.getId() == check)
                    return true;
            }
        return false;
    }
    public static void output(){
        System.out.println("\n<=====================DISPLAY LIST STUDENT========================>");
        Student.title();
        for(Student x: li)
            x.output();
    }

    public static void sortByGpa(){
        for (int i = 0;i < li.size() - 1;i++)
            for(int j = i + 1;j < li.size();j++){
                if(li.get(i).getGpa() > li.get(j).getGpa()){
                    Student tmp = li.get(i);
                    li.set(i, li.get(j));
                    li.set(j, tmp);
                }
            }
        System.out.println("Sort successful!");
    }

    public static boolean removeById(int id){
        for (Student x: li) {
            if(x.getId() == id) {
                li.remove(x);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int choose  = 0;
        do{
            System.out.println("<=====Menu======>");
            System.out.println("1. Input list student");
            System.out.println("2. Output list student");
            System.out.println("3 Sort list student by gpa");
            System.out.println("4 Remove student by id");
            System.out.println("5 Exit");
            System.out.print("Choose = ");
            choose = (new Scanner(System.in).nextInt());
            switch (choose){
                case 1:
                    inputList();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    sortByGpa();
                    break;
                case 4:
                    System.out.print("Input id need remove:");
                    int id = (new Scanner(System.in).nextInt());
                    if(removeById(id))
                        System.out.println("Remove successful!");
                    else
                        System.out.println("Not found student with that id!");
                    break;
                case 5:
                    System.out.println("Exit successful");
                    break;
            }
        }while(choose != 5);

    }
}

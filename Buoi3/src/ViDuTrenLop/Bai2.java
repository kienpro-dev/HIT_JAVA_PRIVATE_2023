package ViDuTrenLop;

import objects.Time;

public class Bai2 {
    public static void main(String[] args) {
        Time time1 = new Time(0, 0, 0);
        time1.display();
        time1.previousSecond();
        time1.display();

        Time time2 = new Time(23, 59, 59);
        time2.display();
        time2.nextSecond();
        time2.display();
    }
}

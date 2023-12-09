package finaltest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tour> tours = new ArrayList<>();
        tours.add(new Tour("1", "Ha Long",
        5000000, 5, "2N1D",
                "Oto"));
        tours.add(new Tour("2", "Thang Long",
        1000000, 2, "2N2D",
                "Oto"));
        tours.add(new Tour("3", "Hai Phong",
        3000000, 10, "1N0D",
                "Xe may"));
        Tour t1 = new Tour("4", "Ha Tinh",
        20000000, 5, "7N6D",
                "May bay");

        TourManager manager = new TourManagerImpl(tours);
        manager.addTour(t1);

        List<Tour> res = manager.sortedTour(false);
        for(Tour t : res) {
            System.out.println(t);
        }

        System.out.println(manager.getTotalStorage());
    }
}

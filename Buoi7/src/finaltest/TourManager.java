package finaltest;

import java.util.List;

public interface TourManager {
    void addTour(Tour t);
    void delTour(Tour t);
    List<Tour> searchTour(String name);
    List<Tour> searchTour(double price);
    List<Tour> sortedTour(boolean isIncrease);
    double getTotalStorage();
}

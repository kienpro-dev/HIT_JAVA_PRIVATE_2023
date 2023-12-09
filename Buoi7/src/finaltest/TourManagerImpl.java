package finaltest;

import java.util.*;

public class TourManagerImpl implements TourManager{
    List<Tour> tours;

    public TourManagerImpl() {
        tours = new ArrayList<>();
    }

    public TourManagerImpl(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public void addTour(Tour t) {
//        for(Tour t1 : tours) {
//            if(t1.getProduct_id() == t.getProduct_id()) {
//                System.out.println("Trung id");
//                return;
//            }
//        }
        tours.add(t);
    }

    @Override
    public void delTour(Tour t) {
        for(int i = 0; i < tours.size(); i++) {
            if(t.getProduct_id() == tours.get(i).getProduct_id()) {
                tours.remove(i);
            }
        }
    }

    @Override
    public List<Tour> searchTour(String name) {
        List<Tour> res = new ArrayList<>();
        for(Tour t : tours) {
            if(t.getProduct_name().contains(name)) {
                res.add(t);
            }
        }
        return res;
    }

    @Override
    public List<Tour> searchTour(double price) {
        List<Tour> res = new ArrayList<>();
        for(Tour t : tours) {
            if(t.getProduct_price() == price) {
                res.add(t);
            }
        }
        return res;
    }

    @Override
    public List<Tour> sortedTour(boolean isIncrease) {
        List<Tour> res = tours;

        Collections.sort(res, new Compare(isIncrease));
        return res;
    }

    @Override
    public double getTotalStorage() {
        double total = 0;
        for (Tour t : tours) {
            total += t.getTotalPrice();
        }
        return total;
    }

}

class Compare implements Comparator<Tour> {
    private int isIncrease;

    public Compare(boolean isIncrease) {
        this.isIncrease = isIncrease ? 1 : -1;
    }
    @Override
    public int compare(Tour o1, Tour o2) {
//        double price = o1.getProduct_price() - o2.getProduct_price();
//        return price > 0 ? 1 : -1;
        return isIncrease * Double.compare(
                o1.getProduct_price(), o2.getProduct_price());
    }
}


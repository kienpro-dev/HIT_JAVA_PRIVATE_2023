import java.util.ArrayList;
import java.util.List;

public class NumberServiceImpl implements IntegerService{
    ArrayList<Integer> list;

    public NumberServiceImpl() {
        this.list = new ArrayList<>();
    }

    public NumberServiceImpl(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void nhapSo(int x) {
        list.add(x);
    }

    @Override
    public void hienThiList() {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    @Override
    public int timSo(int so) {
        for (int i = 0; i < list.size(); i++) {
            if (so == list.get(i)) {
                return i + 1;
            }
        }
        return -1;
    }
}

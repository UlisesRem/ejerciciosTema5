import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImplements implements CocheCRUD {

    List<CocheData> cocheadd = new ArrayList<>();

    @Override
    public void saveCar(CocheData addcoche) {
        cocheadd.add(addcoche);
    }

    @Override
    public List<CocheData> findCar() {
        return cocheadd;
    }

    @Override
    public void deleteCar() {

    }
}

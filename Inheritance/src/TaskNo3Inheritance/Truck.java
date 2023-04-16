package TaskNo3Inheritance;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class Truck extends Transport{
    public Truck(String model, int price, int productionYear) {
        super(model, price, productionYear);
    }
    @Override
    public void move() {
        System.out.println("Truck Move");
    }

}

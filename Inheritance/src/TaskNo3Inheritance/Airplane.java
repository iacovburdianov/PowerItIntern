package TaskNo3Inheritance;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class Airplane extends Transport{
    public Airplane(String model, int price, int productionYear) {
        super(model, price, productionYear);
    }

    @Override
    public void move() {
        System.out.println("Airplane Move");
    }

}

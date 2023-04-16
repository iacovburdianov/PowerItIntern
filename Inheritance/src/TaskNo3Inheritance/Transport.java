package TaskNo3Inheritance;

import java.util.Calendar;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class Transport {
    protected String model;
    protected int price;
    protected int productionYear;

    public Transport(String model, int price, int productionYear) {
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - productionYear;
    }
    public void move() {
        System.out.println("Transport Move");
    }
}

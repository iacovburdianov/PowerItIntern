package TaskNo7Inheritance;

/**
 * Created by Admin on 4/20/2023
 *
 * @author : Admin
 * @date : 4/20/2023
 * @project : Inheritance
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Visitor {
    private String name;
    private String address;
    private String favoriteHotel;

    public Visitor(String name, String address, String favoriteHotel) {
        this.name = name;
        this.address = address;
        this.favoriteHotel = favoriteHotel;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getFavoriteHotel() {
        return favoriteHotel;
    }
}


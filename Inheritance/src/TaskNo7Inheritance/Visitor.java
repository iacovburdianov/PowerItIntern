package TaskNo7Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Visitor {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavoriteHotel() {
        return favoriteHotel;
    }

    public void setFavoriteHotel(String favoriteHotel) {
        this.favoriteHotel = favoriteHotel;
    }
}

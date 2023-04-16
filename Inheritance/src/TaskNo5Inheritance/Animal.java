package TaskNo5Inheritance;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Animal {
    private boolean vaccinated;
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Animal{" +
                " food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

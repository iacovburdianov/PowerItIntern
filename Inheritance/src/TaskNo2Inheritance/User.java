package TaskNo2Inheritance;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Inheritance
 */
public class User {
    public final String name;
    public final String surname;
    public final int year;

    public User(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String  getFullName() {
        return name + " " + surname;
    }

    public String getCourse(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - year) + " - academic year, for current " + currentYear;
    }
}

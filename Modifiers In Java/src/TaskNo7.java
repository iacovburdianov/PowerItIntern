/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */
public class TaskNo7 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
    }
    static boolean isLeapYear(int year) {
        boolean is_leap_year = false;
        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;
        if (!is_leap_year)
           return is_leap_year;
        else
            return is_leap_year;
    }
}

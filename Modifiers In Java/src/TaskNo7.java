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
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        }
        else
            isLeapYear = false;
        if (!isLeapYear)
           return isLeapYear;
        else
            return isLeapYear;
    }
}

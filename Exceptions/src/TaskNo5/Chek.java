package TaskNo5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Admin on 4/13/2023
 *
 * @author : Admin
 * @date : 4/13/2023
 * @project : Exceptions
 */
public class Chek {
    public static boolean isFile(String string) {
        try {
            File f = new File(string);
            return f.exists() && !f.isDirectory();
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean isInt(String string) {
        try {
            Integer.parseInt(string);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isInt("345"));
        System.out.println(isDouble("41234"));
        System.out.println(isFile("src/file.txt"));
    }

}

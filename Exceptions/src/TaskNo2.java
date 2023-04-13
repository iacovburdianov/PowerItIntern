import java.util.Scanner;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Exceptions
 */
public class TaskNo2 {
    public static void main(String[] args) {
        System.out.println("Input a real number:");
        Scanner scanner = new Scanner(System.in);
        boolean validReal1 = scanner.hasNextDouble();
        double r1 = 0;
        while(validReal1) {
            try {
                r1 = scanner.nextDouble();
                if (isDouble(String.valueOf(r1))) {
                    validReal1 = false;
                }
            }catch (NumberFormatException e) {
                System.out.println("Is not a valid number, try one more time: ");
            }
        }
        System.out.println("Input a real number:");
        boolean validReal2 = scanner.hasNextDouble();
        double r2 = 0;
        while(validReal2) {
            try {
                r2 = scanner.nextDouble();
                if (isDouble(String.valueOf(r1))) {
                    validReal2 = false;
                }
            }catch (NumberFormatException e) {
                System.out.println("Is not a valid number, try one more time: ");
            }
        }

        if (r1 == 0 && r2 == 0) {
            System.out.println("Both numbers are 0");
        }
        if (r2 == 0 && r1 != 0) {
            System.out.println("Division to 0 is not possible.");
        }
        double division = r1/r2;
        System.out.println(r1 + " divided by " + r2 + " = " + division) ;
    }
    public static boolean isDouble(String string) {
        if( string.matches("^\\d+\\.\\d+") )
           return true;
        else
            return false;
    }
}

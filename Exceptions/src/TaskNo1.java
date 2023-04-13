import java.util.Scanner;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Exceptions
 */
public class TaskNo1 {
    static int n;
    static double r;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a natural number:");
        boolean validNatural = false;

        while (!validNatural) {

            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n >= 0) validNatural = true;
            } catch (NumberFormatException e) {
                //error
                System.out.println("Is not a valid number, try one more time: ");;
            }
        }

        System.out.println("Input a real number:");
        boolean validReal = false;

        while(!validReal) {
            try {
                r = Double.parseDouble(scanner.nextLine());
                if (r >= 0) validReal = true;
            }catch (NumberFormatException e) {
                System.out.println("Is not a valid number, try one more time: ");
            }
        }



        System.out.println("Sum of the entered numbers: " + (n + r));



    }
}

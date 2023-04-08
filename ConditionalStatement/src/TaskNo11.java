import java.util.Scanner;

public class TaskNo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int basePrice = 30;
        int specialPrice = 15;
        while (age != 0) {
            if (age >= 65){
                System.out.println("Price for ticket is : " + specialPrice);
                break;
            } else {
                System.out.println("Price for ticket is : " + basePrice);
                break;
            }
        }


    }
}

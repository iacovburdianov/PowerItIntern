import java.util.Scanner;

public class TaskNo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Ion says: ");
        int ionNumber = scan.nextInt();
        ionNumber -= 2;
        System.out.print("Vasile says: ");
        for(int i = 0; i < 5; i++){
            System.out.print((ionNumber+i));
            System.out.print("  ");
        }

    }
}

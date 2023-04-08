import java.util.Scanner;

/*
* The roman symbols are I, V, X, L, C, D, and M,
* standing respectively for 1, 5, 10, 50,  100, 500, and 1,000
* in the Hindu-Arabic numeral system.
* */
public class TaskNo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number for example: 1,5,10,100,500 and 1000:");
        int number = scanner.nextInt();

        switch (number) {
            case 1: {
                System.out.println("I");
                break;
            }
            case 5: {
                System.out.println("V");
                break;
            }
            case 10: {
                System.out.println("X");
                break;
            }
            case 50: {
                System.out.println("L");
                break;
            }
            case 100: {
                System.out.println("C");
                break;
            }
            case 500: {
                System.out.println("D");
                break;
            }
            case 1000: {
                System.out.println("M");
                break;
            }
        }
    }

}

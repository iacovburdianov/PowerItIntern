package numerical;

import java.util.Scanner;

public class TaskNo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = scanner.nextInt();
        int n1 = input / 1000 % 10;//first number which we will not use
        int n2 = input / 100 % 10;
        int n3 = input / 10 % 10;
        int n4 = input % 10;

        System.out.print(n2+""+n3+""+n4 + "+" +n3+""+n4+"+"+n4);

    }
}

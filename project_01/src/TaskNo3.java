import java.util.Scanner;

public class TaskNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int subtract = firstNum - secondNum;
        int multiply = firstNum * secondNum;
        double divide = firstNum / secondNum;
        int remainder = firstNum % secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + sum);
        System.out.println(firstNum + " - " + secondNum + " = " + subtract);
        System.out.println(firstNum + " * " + secondNum + " = " + multiply);
        System.out.println(firstNum + " / " + secondNum + " = " + divide);
        System.out.println(firstNum + " % " + secondNum + " = " + remainder);
    }
}

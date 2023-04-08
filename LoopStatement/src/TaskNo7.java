import java.util.Scanner;



/*Write a program that would meet the following conditions:

* Check if the number nr divisible by n;
* Specify all numbers in the range [a; b], divisible by n;
* Specify the first n numbers, divisible by n;
* */
public class TaskNo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        System.out.println("Enter a divisor for Number: ");
        int divisor1 = scanner.nextInt();

//Check if the number nr divisible by n;
        if (num % divisor1 == 0){
            System.out.println("\nIt is divisible by " + divisor1);
        } else {
            System.out.println("\nIt is not divisible by " + divisor1);
        }
//Specify all numbers in the range [a; b], divisible by n;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a beginning range:");
        int beginning = Integer.valueOf(scanner1.nextLine());
        System.out.println("Enter ending range:");
        int end = Integer.valueOf(scanner1.nextLine());
        System.out.println("Enter a divisor:");
        int divisor = scanner1.nextInt();
        divisibleByXInRange(beginning,end,divisor);

//Specify the first n numbers, divisible by n;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\nEnter the value of n: ");
        int n = scanner2.nextInt();
        System.out.println("Enter the value of count: ");
        int count = scanner2.nextInt();
        int num1 = n;
        System.out.println("The first " + count + " numbers divisible by " + n + " are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(num1 + " ");
            num1 += n;
        }
    }


    public static void divisibleByXInRange(int beginning, int end,int divisor) {
        int i = beginning;
        while(i <= end) {
            if(i % divisor == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

}

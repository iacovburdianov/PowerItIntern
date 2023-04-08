import java.util.Scanner;

/*
* Write a program that calculates the amount: S=1+1*2+1*2*3+…+1*2* …*n.
* */
public class TaskNo5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of 'n' ");
        int n = s.nextInt();

        long sum = 0, term = 1;
        for (int i = 1; i <= n; i++)
        {
            term *= i;
            sum += term;
        }
        System.out.println("Sum of the series is " + sum);
    }

}

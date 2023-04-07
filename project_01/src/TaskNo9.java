import java.util.Scanner;

public class TaskNo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nicolae write your age : ");
        int ageNicolae = scan.nextInt();
        System.out.print("Mihai write your age : ");
        int ageMihai = scan.nextInt();

        double avg = (ageNicolae + ageMihai) / 2;
        int difference = ageNicolae - ageMihai;

        System.out.print("Average is: " + avg + "; Difference is: " + Math.abs(difference) + " age");
    }
}

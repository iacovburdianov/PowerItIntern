import java.util.Scanner;

public class TaskNo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.print( "Input first integer: " );
        firstNum = input.nextInt();

        System.out.print( "Input second integer: " );
        secondNum = input.nextInt();

        if ( firstNum == secondNum )
            System.out.printf( "%d == %d\n", firstNum, secondNum );
        if ( firstNum != secondNum )
            System.out.printf( "%d != %d\n", firstNum, secondNum );
        if ( firstNum < secondNum )
            System.out.printf( "%d < %d\n", firstNum, secondNum );
        if ( firstNum > secondNum )
            System.out.printf( "%d > %d\n", firstNum, secondNum );
        if ( firstNum <= secondNum )
            System.out.printf( "%d <= %d\n", firstNum, secondNum );
        if ( firstNum >= secondNum )
            System.out.printf( "%d >= %d\n", firstNum, secondNum );

    }
}

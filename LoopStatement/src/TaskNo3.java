
/*Write a program that displays two-digit numbers that have the last digit divisible by 3.
TestData:10 to 99*/
public class TaskNo3 {
    public static void main(String[] args) {
        int digit,i;

        for (i = 11; i <=99 ; i++) {
            digit = i % 10;
            if (digit % 3 == 0) {
                System.out.println("The Last Digit Is Divisible By 3:  " + i);
            }
        }


    }
}

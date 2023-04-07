import java.util.Scanner;

public class TaskNo7 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            long binaryNum;
            long decimalNum = 0;
            long j = 1;
            long remainder;
            System.out.print("Input a binary number: ");
            binaryNum = scan.nextLong();

            while (binaryNum != 0) {
                remainder = binaryNum % 10;
                decimalNum = decimalNum + remainder*j;
                j = j*2;
                binaryNum = binaryNum / 10;
            }

            System.out.println("Decimal Number: " + decimalNum);
        }


}
